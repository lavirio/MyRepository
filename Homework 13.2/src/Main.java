import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int space = 0;
        boolean isContinue = true;

        while (isContinue) {
        System.out.print("Введите ФИО: ");
        String name = new Scanner(System.in).nextLine();
            for (int a = 0; a < name.length(); a++) {
                if (name.charAt(a) == ' ') {
                    space++;
                    break;
                }
            }
            for (int b = 0; b < name.length(); b++) {
                if (name.charAt(b) >= '0' && name.charAt(b) <= '9' || space > 2 || space == 0) {
                    System.out.println("Введеная строка не является ФИО!");
                    break;
                } else if (name.charAt(b) >= '0' && name.charAt(b) <= '9' || space == 1) {
                    System.out.println("Фамилия: " + name.substring(0, name.indexOf(' ')));
                    System.out.println("Имя: " + name.substring(name.lastIndexOf(' ')));
                    System.out.println("Отчество: Нет");
                    break;
                }
                else {
                    System.out.println("Фамилия: " + name.substring(0, name.indexOf(' ')));
                    System.out.println("Имя: " + name.substring(name.indexOf(' '), name.lastIndexOf(' ')));
                    System.out.println("Отчество: " + name.substring(name.lastIndexOf(' ')));
                    break;
                }
            }
            System.out.println("Хотите попробовать снова? (Y/N)");
            Scanner scanner = new Scanner(System.in);
            if(scanner.nextLine().equals("N")) {
                isContinue = false;
            }
        }
    }
}
