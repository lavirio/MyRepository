import java.text.DecimalFormat;
import java.util.Scanner;

public class Square {
    public static void check () {
        System.out.print("Введите любое число: ");
        int number = new Scanner(System.in).nextInt();

        double result = Math.pow(number,2);
        DecimalFormat round = new DecimalFormat("##");

        System.out.print(String.format(number + "^" + "2" + " = " + round.format(result)));
    }
}
