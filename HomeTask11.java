import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Java Basic HomeTask11
 *
 * @author Nadzeya Yashchuk
 * @todo 12.10.2022
 * @date 14.10.2022
 */

public class HomeTask11 extends JFrame {
    static final int CANVAS_WIDTH = 600;
    static final int CANVAS_HEIGHT = 500;

    static final int DX = 200;

    static int x;
    static int y;
    static int dx;
    static Color color;

    static ImageIcon image;

    static List<Ball> balls;


    final String CANVAS_TITLE = "Repaint";

    static final private Color[] COLORS = {Color.green, Color.cyan, Color.magenta, Color.magenta, Color.LIGHT_GRAY, Color.red, Color.blue, Color.yellow};
    private static Random random = new Random();


    public static void main(String[] args) {

        new HomeTask11();
    }

    public HomeTask11() {
        setTitle("Hello, swing!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CanvasPanel canvasPanel = new CanvasPanel();
        canvasPanel.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        canvasPanel.setBackground(Color.white);

        initBalls();

        canvasPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                super.mouseReleased(event);
                System.out.println(event.getX() + ":" + event.getY());
                for(int i = balls.size() - 1; i > -1; i--) {
                    if(balls.get(i).isInBall(event.getX(), event.getY())) {
                        balls.remove(i);
                        break;
                    }
                }
                canvasPanel.repaint();
            }
        });

        randomXYColor();

        Button repaint = new Button(CANVAS_TITLE);
        repaint.addActionListener(e -> {
            System.out.println("Repaint");
            randomXYColor();
            canvasPanel.repaint();
        });

        Button left = new Button("Left");
        left.addActionListener(e -> {
            x -= 5;
            canvasPanel.repaint();
        });

        Button right = new Button("Right");
        right.addActionListener(e -> {
            x += 5;
            canvasPanel.repaint();
        });

        Button exit = new Button("Exit");
        exit.addActionListener(e -> System.exit(0));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(repaint);
        buttonPanel.add(left);
        buttonPanel.add(right);
        buttonPanel.add(exit);

        add(canvasPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void randomXYColor() {
        color = COLORS[random.nextInt(COLORS.length)];
        x = random.nextInt(CANVAS_WIDTH - DX);
        y = random.nextInt(CANVAS_HEIGHT - DX);
        dx = DX;
    }

    private void initBalls() {
        balls = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Color color = COLORS[random.nextInt(COLORS.length)];
            int d = random.nextInt(100);
            x = random.nextInt(CANVAS_WIDTH - d);
            y = random.nextInt(CANVAS_HEIGHT - d);
            balls.add(new Ball(x, y, d, color));
        }
    }

    private static class CanvasPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (Ball ball : balls) {
                ball.paint(g);

            }
        }
    }
}