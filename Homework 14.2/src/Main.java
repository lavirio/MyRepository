import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(getText().replaceAll("[А-я]+"+".", " ").replaceAll("\\d+", " ").trim());
    }

    public static  String getText(){
        System.out.println("Введите текст на английском языке: ");
        String str = new Scanner(System.in).nextLine();
        return str;
    }
}