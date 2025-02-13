import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawingPanel extends JPanel {
    static List<Triangle> triangles = new ArrayList<>(); // Uloží všechny trojúhelníky

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        List<Triangle> copy;
        synchronized (triangles) {
            copy = new ArrayList<>(triangles); // vytvoření kopie
        }

        for (Triangle triangle : copy) {
            g2d.setColor(triangle.color);
            g2d.fillPolygon(triangle.xPoints, triangle.yPoints, 3);
        }
    }

    public void addCustomTriangle(int x1, int y1, int x2, int y2, int x3, int y3, Color color) {

        triangles.add(new Triangle(new int[]{x1, x2, x3}, new int[]{y1, y2, y3}, color));

    }


    // Vnitřní třída pro reprezentaci trojúhelníku
    private static class Triangle {
        int[] xPoints;
        int[] yPoints;
        Color color;

        Triangle(int[] xPoints, int[] yPoints, Color color) {
            this.xPoints = xPoints;
            this.yPoints = yPoints;
            this.color = color;
        }
    }
}