import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Inputs implements KeyListener {

    public static boolean LEFT = false;
    public static boolean RIGHT = false;
    public static boolean UP = false;
    public static boolean DOWN = false;




    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                LEFT = true;
                break;
            case KeyEvent.VK_RIGHT:
                RIGHT = true;
                break;
            case KeyEvent.VK_UP:
                UP = true;
                break;
            case KeyEvent.VK_DOWN:
                DOWN = true;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                LEFT = false;
                break;
            case KeyEvent.VK_RIGHT:
                RIGHT = false;
                break;
            case KeyEvent.VK_UP:
                UP = false;
                break;
            case KeyEvent.VK_DOWN:
                DOWN = false;
                break;
        }
    }



    @Override
    public void keyTyped(KeyEvent e) {

    }

}
