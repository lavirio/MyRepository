import java.util.*;

public class PhoneBook {
    private static final Map<String, Set<String>> phoneBook = new TreeMap<>();

    public static void clear() {
        if (phoneBook.isEmpty()) {
            System.out.println("Невозможно выполнить действие так как записаная книга пуста!");
            return;
        }
        phoneBook.clear();
        System.out.println("Контакты успешно удалены!");
    }

    public static void list() {
        if (phoneBook.isEmpty()) {
            System.out.println("Записная книга пуста!");
            return;
        }
        for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey());
            for (String num : entry.getValue()) {
                System.out.println(num);
            }
        }
    }

    public static void addByName(String name) {

        if (!phoneBook.containsKey(name)) {
            Set<String> numbers = new HashSet<>();
            System.out.println("Введите номер для абонента " + name + ", чтобы добавить ему номер!");

            String mobileNumber = new Scanner(System.in).nextLine();
            numbers.add(mobileNumber);
            phoneBook.put(name, numbers);

            System.out.println("К абоненту " + name + " успешно добавлен номер!");
        } else {
            Set<String> numbers = phoneBook.get(name);
            System.out.println("Введите новый номер абонента " + name + ":");

            String mobileNumber = new Scanner(System.in).nextLine();
            numbers.add(mobileNumber);
            phoneBook.put(name, numbers);

            System.out.println("Новый номер для абонента " + name + " успешно добавлен");
        }
    }

    public static void addByNumber(String number) {
        boolean isContinue = false;
        for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
            if(entry.getValue().contains(number)) {
                isContinue = true;
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
        if(!isContinue) {
            System.out.println("Введите имя");
            String name = new Scanner(System.in).nextLine();
            if (!phoneBook.containsKey(name)) {
                Set<String> numbers = new HashSet<>();

                numbers.add(number);
                phoneBook.put(name, numbers);
            }
            else {
                phoneBook.get(name).add(number);
            }
        }
    }
}


