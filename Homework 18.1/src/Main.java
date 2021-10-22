import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите команду и email:\n" +
                    "1)Add - добавить email\n" +
                    "2)List - перечень уже добавленных email\n" +
                    "3)Delete - удалить email\n" +
                    "4)Exit - выйти из программы");
            String command = new Scanner(System.in).nextLine();

            if (command.toLowerCase().startsWith("add")) {
                add(command);
            } else if (command.toLowerCase().startsWith("list")) {
                MailBox.list();
            } else if (command.toLowerCase().startsWith("delete")) {
                delete(command);
            } else if (command.toLowerCase().startsWith("exit")) {
                System.out.println("Вы вышли из программы!");
                return;
            } else {
                System.out.println("Команда не распознана, повторите ввод!");
            }
        }
    }
    private static void delete(String command) {
        String mail = command.split("\\s+", 2)[1].trim();
        MailBox.delete(mail);
    }
    private static void add(String command) {
        String mail = command.split("\\s+", 2)[1].trim();
        if (mail.matches("\\S+[@]\\S+[.]\\S+")) {
            MailBox.add(mail);
        } else {
            System.out.println("Email не соответсвует формату ввода!");
        }
    }
}

