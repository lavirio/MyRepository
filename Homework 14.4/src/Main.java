import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер мобильного телефона: ");
        String number = new Scanner(System.in).nextLine();
        String numberNew = number.replaceAll("\\D+","").trim();


        if (numberNew.matches("(7)[0-9]{10}")) {
            System.out.println(numberNew);
        }
        else if (numberNew.matches("(8)[0-9]{10}")) {
            System.out.println(numberNew.replaceAll("^8","7"));
        }
        else if (numberNew.matches("[0-9]{10}")){
            System.out.println("7" + numberNew);
        }
        else {
            System.out.println("Вы ввели номер неправильного формата");
        }
    }
}
