import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите контакт человека: ");
            String action = new Scanner(System.in).nextLine();

            String name = action.split("\\s+",4)[1].trim();
            String type = action.split("\\s+",4)[2].trim();
            String number = action.split("\\s+",4)[3].trim();
            Human human = new Human(name,type,number);

            if (action.toLowerCase().startsWith("add")) {
                add(action);
            } else if (action.toLowerCase().startsWith("list")) {
                Phonebook.list();
            } else if (action.toLowerCase().startsWith("delete")) {
                delete(action);
            } else if (action.toLowerCase().startsWith("edit")){
                edit(human);
            }
            else if (action.toLowerCase().startsWith("exit")) {
                System.out.println("Вы вышли из программы!");
                return;
            } else {
                System.out.println("Команда не распознана!");
            }
        }
    }
    private static void edit(Human human){
        while (true) {
            System.out.println("Введите тип  данных, которые хотите изменить (1-Имя, 2-Тип номера, 3-Номер");
            String edit = new Scanner(System.in).nextLine();
            if (edit.equals("1")) {
                String newName = new Scanner(System.in).nextLine();
                human.setName(newName);
            } else if (edit.equals("2")) {
                String newType = new Scanner(System.in).nextLine();
                human.setTypeOfNumber(newType);
            } else if (edit.equals("3")) {
                String newNumber = new Scanner(System.in).nextLine();
                human.setNumber(newNumber);
            } else {
                System.out.println("Вы ввели не сущетсвующую команду!");
                return;
            }
        }
    }

    private static void delete(String action) {

    }

    private static void add(String action) {
        String name = action.split("\\s+",4)[1].trim();
        String type = action.split("\\s+",4)[2].trim();
        String number = action.split("\\s+",4)[3].trim();
        Phonebook.add(name,type,number);
    }
    private static boolean validation(String action){
        return true;
    }
        }
