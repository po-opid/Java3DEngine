import java.awt.*;

public class Loop {

    public static int fps = 60;
    public static int loopNum = 0;
    static long startTime;

    static int xCord = 50;
    static int yCord = 50;
    static int playerSize = 50;
    static int playerSpeed = 3;



    public static void loop() {

        player();
        controls();

        kazdyNeco();

    }

    private static void controls() {
        if (Inputs.LEFT) {
            xCord = xCord-playerSpeed;
        }
        if (Inputs.RIGHT) {
            xCord = xCord+playerSpeed;
        }
        if (Inputs.UP) {
            yCord = yCord-playerSpeed;
        }
        if (Inputs.DOWN) {
            yCord = yCord+playerSpeed;
        }

    }


    public static void startLoop(){
        startTime = System.nanoTime();
        for (;;){
            long nextLoopTime = (long)(startTime+((double) 1000000000 /fps)*loopNum);
            if (System.nanoTime() >= nextLoopTime) {
                loop();
                loopNum++;
            }
        }
    }


    public static void player(){
        DrawingPanel.triangles.clear();
        Main.kreslCtverec(xCord,yCord,xCord+playerSize,yCord+playerSize, Color.CYAN);

    }


    public static void kazdyNeco(){
        kazdy1();

        if (loopNum % 2 == 0) {
            kazdy2();
        }
        if (loopNum % 3 == 0) {
            kazdy3();
        }
        if (loopNum % 4 == 0) {
            kazdy4();
        }

    }

    public static void kazdy1(){

    }

    public static void kazdy2(){

    }

    public static void kazdy3(){

    }

    public static void kazdy4(){

    }

}
