import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Inputs implements KeyListener {

    public static boolean LEFT = false;
    public static boolean RIGHT = false;
    public static boolean UP = false;
    public static boolean DOWN = false;

    public static boolean SHIFT = false;
    public static boolean CTRL = false;
    public static boolean SPACE = false;
    public static boolean ENTER = false;
    public static boolean ESC = false;
    public static boolean TAB = false;

    public static boolean[] LETTERS = new boolean[26]; // A-Z
    public static boolean[] NUMBERS = new boolean[10]; // 0-9

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode >= KeyEvent.VK_A && keyCode <= KeyEvent.VK_Z) {
            LETTERS[keyCode - KeyEvent.VK_A] = true;
        }
        switch (keyCode) {
            case KeyEvent.VK_LEFT -> LEFT = true;
            case KeyEvent.VK_RIGHT -> RIGHT = true;
            case KeyEvent.VK_UP -> UP = true;
            case KeyEvent.VK_DOWN -> DOWN = true;

            case KeyEvent.VK_SHIFT -> SHIFT = true;
            case KeyEvent.VK_CONTROL -> CTRL = true;
            case KeyEvent.VK_SPACE -> SPACE = true;
            case KeyEvent.VK_ENTER -> ENTER = true;
            case KeyEvent.VK_ESCAPE -> ESC = true;
            case KeyEvent.VK_TAB -> TAB = true;

            case KeyEvent.VK_0, KeyEvent.VK_1, KeyEvent.VK_2, KeyEvent.VK_3,
                 KeyEvent.VK_4, KeyEvent.VK_5, KeyEvent.VK_6, KeyEvent.VK_7,
                 KeyEvent.VK_8, KeyEvent.VK_9 -> NUMBERS[keyCode - KeyEvent.VK_0] = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode >= KeyEvent.VK_A && keyCode <= KeyEvent.VK_Z) {
            LETTERS[keyCode - KeyEvent.VK_A] = false;
        }
        switch (keyCode) {
            case KeyEvent.VK_LEFT -> LEFT = false;
            case KeyEvent.VK_RIGHT -> RIGHT = false;
            case KeyEvent.VK_UP -> UP = false;
            case KeyEvent.VK_DOWN -> DOWN = false;

            case KeyEvent.VK_SHIFT -> SHIFT = false;
            case KeyEvent.VK_CONTROL -> CTRL = false;
            case KeyEvent.VK_SPACE -> SPACE = false;
            case KeyEvent.VK_ENTER -> ENTER = false;
            case KeyEvent.VK_ESCAPE -> ESC = false;
            case KeyEvent.VK_TAB -> TAB = false;

            case KeyEvent.VK_0, KeyEvent.VK_1, KeyEvent.VK_2, KeyEvent.VK_3,
                 KeyEvent.VK_4, KeyEvent.VK_5, KeyEvent.VK_6, KeyEvent.VK_7,
                 KeyEvent.VK_8, KeyEvent.VK_9 -> NUMBERS[keyCode - KeyEvent.VK_0] = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not needed
    }

    public static int getNum(String letter) {
        if (letter.length() == 1) {
            char ch = Character.toUpperCase(letter.charAt(0));
            if (ch >= 'A' && ch <= 'Z') {
                return ch - 'A';
            }
        }
        return -1; // Invalid input
    }
}

/*
Index mapping for LETTERS array:
Index  0 -> A
Index  1 -> B
Index  2 -> C
Index  3 -> D
Index  4 -> E
Index  5 -> F
Index  6 -> G
Index  7 -> H
Index  8 -> I
Index  9 -> J
Index 10 -> K
Index 11 -> L
Index 12 -> M
Index 13 -> N
Index 14 -> O
Index 15 -> P
Index 16 -> Q
Index 17 -> R
Index 18 -> S
Index 19 -> T
Index 20 -> U
Index 21 -> V
Index 22 -> W
Index 23 -> X
Index 24 -> Y
Index 25 -> Z
*/