import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите дату вашего рождения (день/месяц/год)");
        String born = new Scanner(System.in).nextLine().replaceAll("\\D+", ".");

        DateTimeFormatter needFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate bornDay = LocalDate.parse(born,needFormat);

        LocalDate currentDay = LocalDate.now();
        DateTimeFormatter deriveFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy - eee");

        if (currentDay.isBefore(bornDay)) {
            System.out.println("Введеная дата еще не наступила!");
        } else {
            while (bornDay.isBefore(currentDay)) {
                System.out.println(deriveFormat.format(bornDay));
                bornDay = bornDay.plusYears(1);
            }
        }
    }
}
