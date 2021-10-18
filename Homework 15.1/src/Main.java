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

        LocalDate burn = LocalDate.of(year,month,day);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - eee");

//        System.out.println(dateTimeFormatter.format(burn));
//        System.out.println(dateTimeFormatter.format(current));

        if(current.isBefore(burn)) {
            System.out.println("Введеная дата еще не наступила");
        }
        else {
            while (burn.isBefore(current)) {
                System.out.println(dateTimeFormatter.format(burn));
                burn.plusYears(1);
            }
        }


//        LocalDateTime localDateTime = LocalDateTime.now();
//        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        localDateTime.atOffset((ZoneOffset) dateTimeFormatter1.parse(birthdayDate));
//
//        LocalDateTime localDateTime1 = LocalDateTime.now();
//        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy - eee");
//
//        if (localDateTime1.isBefore(localDateTime)) {
//            System.out.println("Введеная дата еще не наступила!");
//        } else {
//            while (localDateTime.isBefore(localDateTime1)) {
//                System.out.println(dateTimeFormatter2.format(localDateTime));
//                localDateTime.plusYears(1);
//            }
//        }
    }
}
