import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(getText().replaceAll("\\W+"," ").replaceAll("\\d+", " ").replaceAll("\\s+", " ").trim().replaceAll(" ","\n"));
    }

    public static  String getText(){
        System.out.println("Введите текст на английском языке: ");
        return new Scanner(System.in).nextLine();
    }
}