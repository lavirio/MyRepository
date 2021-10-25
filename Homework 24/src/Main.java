import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в симулятор записной книжки.\n" +
                "Здесь можно выполнять разные действия, а именно:\n" +
                "1)Put - добавлять новые контакты\n" +
                "2)Delete - удалять контакт\n" +
                "3)Clear - очистить записную книжку\n" +
                "4)Search name - поиск контактной информации по имени\n" +
                "5)Search number - поиск контакт информации по номеру телефона\n" +
                "6)All - распечатать все контакты из записной книжки\n" +
                "7)Info - посмотреть доступные команды\n" +
                "8)Exit - выход из программы");

        while (true) {
            System.out.println("Введите команду:");
            String action = new Scanner(System.in).nextLine();

            if (action.toLowerCase().startsWith("put")) {
                put(action);
            } else if (action.toLowerCase().startsWith("delete")) {
                delete(action);
            } else if (action.toLowerCase().startsWith("clear")) {
                clear();
            } else if (action.toLowerCase().matches("\\S+\\s+\\S+")) {
                searchName(action);
            } else if (action.toLowerCase().matches("\\S+\\s+\\d+")) {
                searchNumber(action);
            } else if (action.toLowerCase().startsWith("all")) {
                print();
            } else if (action.toLowerCase().startsWith("info")) {
                info();
            } else if (action.toLowerCase().startsWith("exit")) {
                System.out.println("Вы вышли из программы!");
                return;
            } else {
                System.out.println("Команда не распознана, повторите ввод!");
            }
        }
    }

    private static void put(String action) {
        PhoneBook.putNewContact(getName(action), getNumber(action));
    }

    private static void delete(String action) {
        PhoneBook.deleteContact(getName(action));
    }

    private static void clear() {
        PhoneBook.clearAllContacts();
    }

    private static void searchName(String action) {
        PhoneBook.searchContactsByName(getName(action));
    }

    private static void searchNumber(String action) {
        PhoneBook.searchContactsByNumber(getNumber(action));
    }

    private static void print() {
        PhoneBook.printAllContacts();
    }

    private static void info() {
        PhoneBook.directoryInfo();
    }

    public static String getName(String action) {
        if (action.matches("\\S+\\s+\\S+")) {
            return action.split("\\s+", 2)[1].trim();
        } else {
            return action.split("\\s+", 3)[1].trim();
        }
    }

    public static String getNumber(String action) {
        if (action.matches("\\S+\\s+\\d+")) {
            return action.split("\\s+", 2)[1].trim();
        } else {
            return action.split("\\s+", 3)[2].trim();
        }
    }
}
