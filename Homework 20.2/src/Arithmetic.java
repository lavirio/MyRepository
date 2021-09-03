import java.util.Scanner;

public class Arithmetic {
    int num1;
    int num2;

    public Arithmetic(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int getInt(){
        System.out.print("Введите число: ");
        return new Scanner(System.in).nextInt();
    }
    public void calc(int num1, int num2) {
        int sum;
        int diff;
        int inc;
        int avg;
        int min;
        int max;
        diff = num1 - num2;
        sum = num1 + num2;
        inc = num1 * num2;
        avg = (num1 + num2)/2;
        min = Math.min(num1, num2);
        max = Math.max(num1, num2);
        System.out.print("Сумма двух чисел: " + sum + "\n");
        System.out.print("Разность двух чисел: " + diff + "\n");
        System.out.print("Произведение двух чисел: " + inc + "\n");
        System.out.print("Разность двух чисел: " + avg + "\n");
        System.out.print("Минимум из двух чисел: " + min + "\n");
        System.out.print("Максимум из двух чисел: " + max + "\n");
    }


}
