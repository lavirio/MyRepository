import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в симулятор записной книжки.\n" +
                "Здесь можно выполнять разные действия, а именно:\n" +
                "1)Добавлять новые контакты\n" +
                "2)Поиск контактной информации по имени\n" +
                "3)Поиск контакт информации по номеру телефона\n" +
                "4)Clear - очистить записную книжку\n" +
                "5)List - распечатать все контакты из записной книжки\n" +
                "6)Info - посмотреть доступные команды\n" +
                "7)Exit - выход из программы");

        while (true) {
            System.out.println("Введите  номер, имя или команду:");
            String action = new Scanner(System.in).nextLine();

            if (action.toLowerCase().startsWith("clear")) {
                clear();
            } else if (action.toLowerCase().startsWith("list")) {
                print();
            } else if (action.toLowerCase().startsWith("info")) {
                info();
            } else if (action.toLowerCase().startsWith("exit")) {
                System.out.println("Вы вышли из программы!");
                return;
            } else if (action.toLowerCase().matches("^\\d+")) {
                searchNumber(action);
            } else if (action.toLowerCase().matches(".+")) {
                searchName(action);
            } else {
                System.out.println("Команда не распознана, повторите ввод!");
            }
        }
    }

    private static void clear() {
        PhoneBook.clearAllContacts();
    }

    private static void searchNumber(String action) {
        if (action.matches("(7)[0-9]{10}")) {
            String matchNumber = action.replaceAll("^7", "+7");
            PhoneBook.searchContactsByNumber(matchNumber);
        } else if (action.matches("(8)[0-9]{10}")) {
            String matchNumber = action.replaceAll("^8", "+7");
            PhoneBook.searchContactsByNumber(matchNumber);
        } else if (action.matches("[0-9]{10}")) {
            String matchNumber = "+7".concat(action);
            PhoneBook.searchContactsByNumber(matchNumber);
        } else {
            System.out.println("Вы ввели номер неправльного формата, повторите ввод:");
        }
    }

    private static void searchName(String action) {
        PhoneBook.searchContactsByNameConditions(action);
    }

    private static void print() {
        PhoneBook.printAllContacts();
    }

    private static void info() {
        PhoneBook.directoryInfo();
    }
}