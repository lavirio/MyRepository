import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите дату ваше рождения (день/месяц/год)");
        String birthdayDate = new Scanner(System.in).nextLine().replaceAll("\\D+", ".");

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        localDateTime.atOffset((ZoneOffset) dateTimeFormatter1.parse(birthdayDate));

        LocalDateTime localDateTime1 = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy - eee");

        if (localDateTime1.isBefore(localDateTime)) {
            System.out.println("Введеная дата еще не наступила!");
        } else {
            while (localDateTime.isBefore(localDateTime1)) {
                System.out.println(dateTimeFormatter2.format(localDateTime));
                localDateTime.plusYears(1);
            }

        }
    }
}
