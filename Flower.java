import javax.swing.*;
import java.awt.*;

public class Flower extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        
        this.setBackground(Color.WHITE);

        
        drawFlower(g, 200, 200, 100); // x, y, radius
    }

    private void drawFlower(Graphics g, int x, int y, int radius) {
        
        g.setColor(Color.YELLOW);
        g.fillOval(x - 10, y - 10, 20, 20);

        
        g.setColor(Color.PINK);
        for (int i = 0; i < 12; i++) {
            int px = x + (int) (radius * Math.cos(i * Math.PI / 6));
            int py = y + (int) (radius * Math.sin(i * Math.PI / 6));
            g.fillOval(px - 20, py - 20, 40, 40);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flower");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Flower());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
