import java.awt.*;

public class Loop {

    public static int fps = 120;
    public static int loopNum = 0;
    static long startTime;
    static long lastLoopTime;
    static long timeOfLoop = 1000000000/fps;

    static int xCord = 50;
    static int yCord = 50;
    static int playerSize = 50;
    static int playerSpeed = 3;

    static int W = Inputs.getNum("W");
    static int A = Inputs.getNum("A");
    static int S = Inputs.getNum("S");
    static int D = Inputs.getNum("D");


    public static void loop() {


        controls();
        DrawingPanel.triangles.clear();
        player();

        kazdyNeco();
        Main.panel.repaint();

    }

    private static void controls() {
        if (Inputs.LEFT || Inputs.LETTERS[A]) {
            xCord = xCord-playerSpeed;
        }
        if (Inputs.RIGHT || Inputs.LETTERS[D]) {
            xCord = xCord+playerSpeed;
        }
        if (Inputs.UP || Inputs.LETTERS[W]) {
            yCord = yCord-playerSpeed;
        }
        if (Inputs.DOWN || Inputs.LETTERS[S]) {
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
                timeOfLoop = nextLoopTime - lastLoopTime;
                lastLoopTime = nextLoopTime;
            }
        }
    }


    public static void player(){
        //DrawingPanel.triangles.clear();
        //Main.kreslCtverec(0,0,Main.frameSizeX,Main.frameSizeY,Color.gray);
        //Main.kreslCtverec(0,0,Main.frameSizeX-20,Main.frameSizeY-20,Color.BLUE);
        //Main.randomCtverceWholeFrame(20,10,Color.BLACK);
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
        if (loopNum % fps == 0) {
            kazdy1Sekunda();
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

    public static void kazdy1Sekunda(){
        System.out.println("--------------------------------");
        System.out.println("Seconds elapsed:    "+loopNum/fps);
        System.out.println("Triangles to draw:  "+DrawingPanel.triangles.size());
    }

}
