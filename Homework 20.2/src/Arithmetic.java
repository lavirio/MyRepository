
public class Arithmetic {
    int num1;
    int num2;

    public Arithmetic(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void calc() {
        System.out.print("Сумма двух чисел: " + (num1 + num2) + "\n");
        System.out.print("Разность двух чисел: " + (num1 - num2) + "\n");
        System.out.print("Произведение двух чисел: " + num1 * num2 + "\n");
        System.out.print("Среднее значение двух чисел: " + (num1 + num2)/2 + "\n");
        System.out.print("Минимум из двух чисел: " + Math.min(num1,num2) + "\n");
        System.out.print("Максимум из двух чисел: " + Math.max(num1,num2) + "\n");
    }


}
