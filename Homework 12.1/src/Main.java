import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;

        System.out.println("Введите число: ");
        a = new Scanner(System.in).nextInt();
        String b = String.valueOf(a);
        int f = Integer.parseInt(String.valueOf(b.charAt(0)));
        int g = Integer.parseInt(String.valueOf(b.charAt(1)));
        int h = Integer.parseInt(String.valueOf(b.charAt(2)));

        System.out.println(f + g + h);
    }
}
