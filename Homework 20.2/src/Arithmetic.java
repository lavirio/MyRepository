import java.text.DecimalFormat;
import java.util.Scanner;

public class Arithmetic {

    public static int getInt(){
        System.out.print("Введите число: ");
        return new Scanner(System.in).nextInt();
    }

    public static void calc1(double num1, double num2){
        double a,b,c,d,e,f;
        DecimalFormat t = new DecimalFormat("##");
        System.out.print("Сумма двух чисел: ");
        a = num1 + num2;
        System.out.println(t.format(a));
        System.out.print("Разность двух чисел: ");
        b = num1 - num2;
        System.out.println(t.format(b));
        System.out.print("Произведение двух чисел: ");
        c = num1 * num2;
        System.out.println(t.format(c));
        System.out.print("Среднее арифметическое двух чисел: ");
        d = (num1 + num2)/2;
        System.out.println(d);
        System.out.print("Максимальное значение двух чисел: ");
        e = Math.max(num1, num2);
        System.out.println(t.format(e));
        System.out.print("Минимальное значение двух чисел: ");
        f = Math.min(num1, num2);
        System.out.println(t.format(f));
    }

}
