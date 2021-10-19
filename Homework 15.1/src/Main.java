import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate current = LocalDate.now();

        System.out.println("Введите год вашего рождения?");
        int year = new Scanner(System.in).nextInt();

        System.out.println("Введите месяц вашего рождения?");
        int month = new Scanner(System.in).nextInt();

        System.out.println("Введите число вашего рождения?");
        int day = new Scanner(System.in).nextInt();

        LocalDate born = LocalDate.of(year,month,day);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - eee");

        if(current.isBefore(born)) {
            System.out.println("Введеная дата еще не наступила");
        }
        else {
            while (born.isBefore(current)) {
                System.out.println(dateTimeFormatter.format(born));
                born = born.plusYears(1);
            }
        }
    }
}
