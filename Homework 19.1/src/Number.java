import java.util.Scanner;

public class Number {
    static public void check() {
        int a;
        int b;

        System.out.print("Введите первое число: ");
        a = new Scanner(System.in).nextInt();

        System.out.print("Введите второе число: ");
        b = new Scanner(System.in).nextInt();

        System.out.println("Наименьшее число из " + a + " и " + b + ":" + " " + Math.min(a,b));


    }
}
