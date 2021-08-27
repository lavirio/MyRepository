import java.util.Scanner;

public class Even {
    public static void check() {
        System.out.print("Введите число: ");
        int a = new Scanner(System.in).nextInt();

        if(a % 2 == 0) {
            System.out.print("Число " + a + " четное");
        }
        else {
            System.out.print("Число " + a + " не четное");
        }
    }
}
