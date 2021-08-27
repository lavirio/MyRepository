import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("Pong");
        window.setSize(700,500);
        Logic game = new Logic();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        window.setResizable(false);
        window.setVisible(true);
//        window.setLocation(600,400);
        window.add(game);


    }
}
