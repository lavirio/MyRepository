import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите команду:");
            String command = new Scanner(System.in).nextLine();

            if (command.toLowerCase().startsWith("add")) {
                add(command);
            } else if (command.toLowerCase().startsWith("list")) {
                PhoneBook.list();
            } else if (command.toLowerCase().startsWith("delete")) {
                delete(command);
            } else if (command.toLowerCase().startsWith("edit")) {
                edit(command);
            } else {
                System.out.println("Ввод не корректен, попробуйте снова!");
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
        String number = command.split("\\s+")[1].trim();
        if (number.matches("(7)[0-9]{10}")) {
            PhoneBook.add("+" + number);
        }
        else if (number.matches("(8)[0-9]{10}")){
            PhoneBook.add(number.replaceAll("^8","+7"));
        }
        else if (number.matches("[0-9]{10}")){
            PhoneBook.add("+7 " + number);
        }
        else {
            System.out.println("Вы ввели номер неправильного формата!");
            return;
        }
    }
}
