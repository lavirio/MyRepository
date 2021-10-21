import java.util.ArrayList;

public class PhoneBook {
    final private static ArrayList<String> phoneBook = new ArrayList<>();


    public static void add(String number){
        if(phoneBook.contains(number)){
            System.out.println("Номер уже существует!");
            return;
        }
        phoneBook.add(number);
        System.out.println("Номер " + number + " успешно добавлен");
    }

    public static void list(){
        if(phoneBook.isEmpty()){
            System.out.println("Список телефонов пуст!");
            return;
        }
        for (String s : phoneBook) {
            System.out.println("Номер: " + s);
        }
    }

    public static void edit (String newNumber, int index){
        if(validateIndex(index)) {
        System.out.println("Номер " + phoneBook.get(index) + " успешно заменен на " + newNumber);
        phoneBook.set(index, newNumber);
        }
    }

    public static void delete (int index) {
        if (validateIndex(index)) {
            System.out.println("Номер: " + phoneBook.get(index) + " успешно удален");
            phoneBook.remove(index);
        }
    }
    private static boolean validateIndex(int index) {
        if(PhoneBook.phoneBook.size() <= index) {
            System.out.println("Элемента под индексом " + index + "нет!");
            return false;
        }
        return true;
    }
}
