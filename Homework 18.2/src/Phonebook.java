import java.util.Set;
import java.util.TreeSet;

public class Phonebook {
    private static final Set <String> phoneBook  = new TreeSet<>();

    public static void add(String name,String type, String number){
        if(phoneBook.contains(number) && phoneBook.contains(type)){
            System.out.println("Номер уже имеется в записной книжке!");
            return;
        }

        System.out.println("Конакт " + name + " успешно создан");
        phoneBook.add("Имя - " + name + ", Тип номера - " + type + ", Номер - " + number);
    }

    public static void list(){


    }
}
