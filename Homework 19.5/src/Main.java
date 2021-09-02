import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Результат: " + calc(getInt(),getInt(),getOperation()));
    }
    public static int getInt(){
        System.out.print("Введите число: ");
        return new Scanner(System.in).nextInt();
    }
    public static char getOperation(){
        System.out.print("Введите знак: ");
        return new Scanner(System.in).next().charAt(0);
    }
    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Операция не распознана. Повторите ввод");
                result = calc(num1, num2, getOperation());
            }
        }
        return result;
    }
}