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
        int result = 0;
        switch(operation) {
            case '+': result = num1 + num2;
            break;
            case '-': result = num1 - num2;
            break;
            case '*': result = num1 * num2;
            break;
            case '/': result = num1 / num2;
            break;
            default:
                System.out.println("Ошибка");
        }
        return result;
    }
}
