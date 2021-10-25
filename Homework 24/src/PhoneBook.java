import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private static final Map<String, String> phoneBook = new TreeMap<>();

    public static void putNewContact(String name, String number) {
        phoneBook.put(name, number);
        System.out.println("Контакт с именем " + name + " добавлен");
    }

    public static void deleteContact(String name) {
        if (!phoneBook.containsKey(name)) {
            System.out.println("Контакта с таким именем нет!");
            return;
        }
        phoneBook.remove(name);
        System.out.println("Контакт " + name + " успешно удален");
    }

    public static void clearAllContacts() {
        phoneBook.clear();
        System.out.println("Все контакты успешно удалены!");
    }

    public static void searchContactsByName(String name) {
        if (!phoneBook.containsKey(name)) {
            System.out.println("Контакта с таким именем нет в записной книжке!");
            return;
        }
        System.out.println(name + " " + phoneBook.get(name));
    }

    public static void searchContactsByNumber(String number) {
        if (!phoneBook.containsValue(number)) {
            System.out.println("Контакта с таким номером не существует!");
            return;
        }
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(number)) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

    public static void printAllContacts() {
        if (phoneBook.isEmpty()) {
            System.out.println("Записная книжка пуста!");
            return;
        }
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void directoryInfo() {
        System.out.println("1)Put - добавлять новые контакты\n" +
                "2)Delete - удалять контакт\n" +
                "3)Clear - очистить записную книжку\n" +
                "4)Search name - поиск контактной информации по имени\n" +
                "5)Search number - поиск контакт информации по номеру телефона\n" +
                "6)All - распечатать все контакты из записной книжки\n" +
                "7)Info - посмотреть доступные команды\n" +
                "8)Exit - выход из программы");
    }
}