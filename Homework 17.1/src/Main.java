import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Добро пожаловать в аналог записной книжки.\n" +
                    "Для вас доступно пять команд:\n" + "1) Add - добавить контакт в записную книжку\n" +
                    "2) List - посмотреть список контактов\n" +
                    "3) Delete - удалить контакт\n" +
                    "4) Edit - изменить контакт\n" +
                    "5) Exit - выйти из записной книжки");
            String command = new Scanner(System.in).nextLine();

            if(command.toLowerCase().matches("[ad]+\\s+\\d+")){
                add(command);
            } else if (command.toLowerCase().startsWith("add")) {
                addWithName(command);
            } else if (command.toLowerCase().startsWith("list")) {
                PhoneBook.list();
            } else if (command.toLowerCase().startsWith("delete")) {
                delete(command);
            } else if (command.toLowerCase().startsWith("edit")) {
                edit(command);
            } else if (command.toLowerCase().startsWith("exit")){
                System.out.println("Вы вышли из записной книжки!");
                isContinue = false;
            }
            else {
                System.out.println("Введеная команда нераспознана, попробуйте снова!");
            }
        }
    }

    private static void edit(String command) {
        String info = command.split("\\s+", 2)[1].trim();
        int index = Integer.parseInt(info.split("\\s+")[0].trim());
        String newNumber = info.split("\\s+")[1].trim();
        PhoneBook.edit(newNumber, index);
    }

    private static void delete(String command) {
        int index = Integer.parseInt(command.split("\\s+")[1].trim());
        PhoneBook.delete(index);
    }
    private static void add(String command) {
        String number = command.split("\\s+",2)[1].trim();
        if (number.matches("(7)[0-9]{10}")) {
            PhoneBook.add("+" + number);
        }
        else if (number.matches("(8)[0-9]{10}")){
            PhoneBook.add(number.replaceAll("^8","+7"));
        }
        else if (number.matches("[0-9]{10}")){
            PhoneBook.add("+7" + number);
        }
        else {
            System.out.println("Вы ввели номер неправильного формата!");
            return;
        }
    }
    private static void addWithName(String command) {
        String info = command.split("\\s+",2)[1].trim();
        String name = info.split("\\s+",2)[0].trim();
        String number = info.split("\\s+",2)[1].trim();
        if (number.matches("(7)[0-9]{10}")) {
            PhoneBook.add(name,"+" + number);
        }
        else if (number.matches("(8)[0-9]{10}")){
            PhoneBook.add(name, number.replaceAll("^8","+7"));
        }
        else if (number.matches("[0-9]{10}")){
            PhoneBook.add(name,"+7" + number);
        }
        else {
            System.out.println("Вы ввели номер неправильного формата!");
            return;
        }
    }
}
