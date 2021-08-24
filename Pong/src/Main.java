import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("Pong");
        Logic game = new Logic();
        window.setSize(600,420);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        window.setResizable(false);
        window.setVisible(true);
        window.setLocation(600,400);
        window.add(game);


    }
}
