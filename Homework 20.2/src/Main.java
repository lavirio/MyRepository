import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arithmetic arith = new Arithmetic(getInt(),getInt());
        arith.calc();
    }
    public static int getInt(){
        System.out.print("Введите число: ");
        return new Scanner(System.in).nextInt();
    }
}
