import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits());
    }

    public static int getNum() {
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextInt();
    }

    public static Integer sumDigits() {
        int sum = 0;
        String s = Integer.toString(getNum());
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return sum;
    }
}
