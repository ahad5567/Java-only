
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class HeartPattern extends JPanel {

    Random random = new Random();
    Color[] colors = {
            Color.RED,
            Color.BLUE,
            Color.GREEN,
            Color.PINK
    };

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        int cx = getWidth() / 2;
        int cy = getHeight() / 2 + 40;

        for (int i = 0; i < 120; i++) {

            double angle = i * Math.PI * 2 / 120;

            double x = 16 * Math.pow(Math.sin(angle), 3) * 15;
            double y = (13 * Math.cos(angle)
                    - 5 * Math.cos(2 * angle)
                    - 2 * Math.cos(3 * angle)
                    - Math.cos(4 * angle)) * 15;

            int x2 = cx + (int) x;
            int y2 = cy - (int) y;

            g2.setColor(colors[random.nextInt(colors.length)]);

            // Line from center
            g2.drawLine(cx, cy - 40, x2, y2);

            // Burst
            for (int k = 0; k < 8; k++) {
                double a = Math.toRadians(k * 45);

                int ex = x2 + (int) (6 * Math.cos(a));
                int ey = y2 + (int) (6 * Math.sin(a));

                g2.drawLine(x2, y2, ex, ey);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Heart");
        HeartPattern panel = new HeartPattern();

        panel.setBackground(Color.BLACK);

        frame.add(panel);
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
