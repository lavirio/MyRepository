import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ФИО: ");
        String fio = new Scanner(System.in).nextLine();

        if(fio.matches("[А-я]+\\s+[А-я]+\\s+[А-я]+")){
            System.out.println("Valid");
            System.out.println("Фамилия: " + fio.substring(0, fio.indexOf(" ")));
            System.out.println("Имя: " + fio.substring(fio.indexOf(" "),fio.lastIndexOf(" ")));
            System.out.println("Отчество: " + fio.substring(fio.lastIndexOf(" ")));
        }
        else {
            System.out.println("Invalid");
        }
    }
}
