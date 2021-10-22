import java.util.Scanner;

public class Main {
    private static final String EMAIL_REGEX = "\\S+[@]\\S+[.]\\S+";
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
        MailBox.delete(getMail(command));
    }
    private static void add(String command) {
        if (getMail(command).matches(EMAIL_REGEX)) {
            MailBox.add(getMail(command));
        } else {
            System.out.println("Email не соответсвует формату ввода!");
        }
    }
    private static String getMail(String command){
        return command.split("\\s+", 2)[1].trim();
    }
}

