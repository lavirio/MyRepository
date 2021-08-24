import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Logic extends JPanel implements ActionListener, KeyListener {
private int BIT1Y=120,BIT2Y=120;
private int BALLpX=283,BALLpY=160;
private int BALLX=3,BALLY=3;
private Timer time;
    Logic(){
       addKeyListener(this);
       time = new Timer(20,this);
       setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        //Background
        g.setColor(Color.BLACK);
        g.fillRect(0,0,600,400);
        //Middle line
        g.setColor(Color.WHITE);
        g.drawLine(290,0,290,400);
        //Tab 1
        g.fillRect(0,BIT1Y,10,100);
        g.setColor(Color.WHITE);
        //Tab 2
        g.fillRect(590,BIT2Y,10,100);
        g.fillRect(BALLpX,BALLpY,14,14);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    repaint();
    BALLpX+=BALLX;
    BALLpY+=BALLY;
    if(BALLpY<=0){
        BALLY=-BALLY;
    }
        if(BALLpY>350){
            BALLY=-BALLY;
        }
        if(BALLpY-50<=BIT2Y && BALLpX>=300 && BALLX>0) {
            BIT2Y-=5;
        }
        if(BALLpY-50>=BIT2Y && BALLpX>=300 && BALLX>0) {
            BIT2Y+=5;
        }
        if(new Rectangle(BALLpX,BALLpY,14,14).intersects(new Rectangle(590,BIT2Y,10,100))) {
            BALLX=-BALLX;
        }
        if(new Rectangle(BALLpX,BALLpY,14,14).intersects(new Rectangle(0,BIT1Y,10,100))) {
            BALLX=-BALLX;
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    if(e.getKeyCode()==KeyEvent.VK_DOWN){
        BIT1Y+=10;
        if(BIT1Y>300) {
            BIT1Y=300;
        }
    }
        if(e.getKeyCode()==KeyEvent.VK_UP){
            BIT1Y-=10;
            if(BIT1Y<=0) {
                BIT1Y=0;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER);
        time.start();

    }
}
