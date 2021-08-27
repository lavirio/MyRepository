import java.util.Scanner;

public class TorF {
    public static void check () {
        System.out.print("Введите число: ");

        double number = new Scanner(System.in).nextDouble();

        System.out.print("Введите число границу: ");
        double border = new Scanner(System.in).nextDouble();

        if (number > border) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
