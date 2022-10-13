import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Java Basic HomeTask10
 *
 * @author Nadzeya Yashchuk
 * @todo 10.10.2022
 * @date 13.10.2022
 */

public class HomeTask10 extends JFrame {

    static final private Color[] COLORS = {Color.green, Color.cyan, Color.magenta, Color.magenta, Color.LIGHT_GRAY,Color.red, Color.blue, Color.yellow};
    private static Random random = new Random();


    public static void main(String[] args) {
        new HomeTask10();
    }

    public HomeTask10() {
        setTitle("Hello, swing!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,500);

        CanvasPanel canvasPanel = new CanvasPanel();
        canvasPanel.setBackground(Color.white);

        Button button = new Button("Repaint");
        button.addActionListener(e -> {
            System.out.println("Repaint");
            canvasPanel.repaint();
        });

        add(canvasPanel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private static class CanvasPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (int i = 0; i < 300; i++) {
                g.setColor(COLORS[random.nextInt(COLORS.length)]);
                int x = random.nextInt(500);
                int y = random.nextInt(400);
                int dx = random.nextInt(100);
                int dy = random.nextInt(100);
                if(random.nextBoolean()) {
                    g.fillRect(x, y, dx, dy);
                } else {
                    g.fillOval(x, y, dx, dy);
                }
             }
        }
    }
}
