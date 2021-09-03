public class Main {
    public static void main(String[] args) {
    Printer basketLev = new Printer();

    basketLev.append("Как я провел лето! ");
    basketLev.append("|| Как хорошо на море!", "|| Однажды летом, я поехал на море...");
    basketLev.print("Очередь на печать Льва:");

    Printer basketAnton = new Printer();
    basketAnton.print("Очередь на печать Антона:");

    basketLev.getPagesCount();
    }
}
