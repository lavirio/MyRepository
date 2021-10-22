import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Введите команду:\n" +
                    "1) add - добавить дело\n" +
                    "2) list - посмотреть список дел\n" +
                    "3) edit - редактировать дело\n" +
                    "4) delete - удалить дело\n" +
                            "5) exit - выйти из программы");
            String command = new Scanner(System.in).nextLine();

            if (command.toLowerCase().matches("[ad]+\\s+\\d+.+")){
                addToIndex(command);
            } else if (command.toLowerCase().startsWith("add")) {
                add(command);
            } else if (command.toLowerCase().startsWith("list")) {
                Grocery.list();
            } else if (command.toLowerCase().startsWith("edit")) {
                edit(command);
            } else if (command.toLowerCase().startsWith("delete")) {
                delete(command);
            } else if (command.toLowerCase().startsWith("exit")) {
                System.out.println("Вы вышли из списка дел!");
                isContinue = false;
            }

                else {
                System.out.println("Введеная команда не распознана, попробуйте снова!");
            }
        }
    }

    private static void edit(String command) {
        String info = command.split("\\s+", 2)[1].trim();
        int index = Integer.parseInt(info.split("\\s")[0].trim());
        String newDoing = info.substring(info.indexOf(" ")).trim();
        Grocery.edit(index, newDoing);
    }
    private static void delete(String command) {
        int index = Integer.parseInt(command.split("\\s+")[1].trim());
        Grocery.delete(index);
    }

    private static void add(String command) {
        String cause = command.substring(command.indexOf(" ")).trim();
        Grocery.add(cause);
    }
    private static void addToIndex(String command){
        String info = command.split("\\s+", 2)[1].trim();
        int index = Integer.parseInt(info.split("\\s",2)[0].trim());
        String newDoing = info.split("\\s+",2)[1].trim();
        Grocery.add(index,newDoing);
    }
}
