import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    private static DrawingPanel panel;




    public static void main(String[] args) {

        start();

        Loop.startLoop();

    }



    public static void start(){
        JFrame frame = new JFrame("Zelený trojúhelník");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        panel = new DrawingPanel();
        frame.add(panel);
        Inputs inputs = new Inputs();
        frame.addKeyListener(inputs);

        frame.setVisible(true);


    }


    public static void randomCtverce(int x1, int y1, int x2, int y2, int maxSize, int howMany, Color color) {
        Random random = new Random();
        int X1 = min(x1,x2);
        int Y1 = min(y1,y2);
        int X2 = max(x1,x2);
        int Y2 = max(y1,y2);
        int xSize = X2-X1;
        int ySize = Y2-Y1;

        for (int i = 0; i <= howMany; i++) {
            int X1cord = X1+random.nextInt(xSize);
            int Y1cord = Y1+random.nextInt(ySize);
            int X2cord = X1cord+random.nextInt(maxSize);
            int Y2cord = Y1cord+random.nextInt(maxSize);

            kreslCtverec(X1cord,Y1cord,X2cord,Y2cord,color);

        }

    }



    public static void textura1(int x1, int y1, int x2, int y2, int padding, Color color1, Color color2){
        int X1 = min(x1,x2);
        int Y1 = min(y1,y2);
        int X2 = max(x1,x2);
        int Y2 = max(y1,y2);
        Color barva;

        for(int i = 0;;i++){
            int pom = i*padding;
            if (X1+pom >= X2-pom||Y1+pom >= Y2-pom) {break;}

            if (i % 2 == 0) {barva = color1;} else {barva = color2;}

            kreslCtverec(X1+pom,Y1+pom,X2-pom,Y2-pom,barva);
        }
    }



    public static void kreslCtverec(int x1, int y1, int x2, int y2, Color color){
        panel.drawCustomTriangle(x1, y1, x1, y2, x2, y2, color);
        panel.drawCustomTriangle(x1, y1, x2, y1, x2, y2, color);

    }






    public static int max(int num1, int num2){
        if (num1 > num2){
            return num1;
        } else {
            return num2;
        }
    }

    public static int min(int num1, int num2){
        if (num1 < num2){
            return num1;
        } else {
            return num2;
        }
    }


}
