import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FlyingButtonsGame extends JFrame implements ActionListener {
    private JButton[] buttons;
    private Timer timer;
    private final int buttonCount = 5;
    private final int buttonSize = 50;
    private final int frameWidth = 800;
    private final int frameHeight = 600;
    private Random random = new Random();

    public FlyingButtonsGame() {
        setTitle("Flying Buttons Game");
        setSize(frameWidth, frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        buttons = new JButton[buttonCount];
        for (int i = 0; i < buttonCount; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            buttons[i].setSize(buttonSize, buttonSize);
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        timer = new Timer(100, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton clickedButton = (JButton) e.getSource();
            remove(clickedButton);
            revalidate();
            repaint();
        } else {
            for (JButton button : buttons) {
                int dx = random.nextInt(5) - 2;
                int dy = random.nextInt(5) - 2;
                button.setLocation(button.getX() + dx, button.getY() + dy);
                checkButtonCollision(button);
            }
        }
    }

    private void checkButtonCollision(JButton button) {
        for (JButton otherButton : buttons) {
            if (!button.equals(otherButton) && button.getBounds().intersects(otherButton.getBounds())) {
                button.setSize(button.getWidth() + 10, button.getHeight() + 10);
                remove(otherButton);
                revalidate();
                repaint();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FlyingButtonsGame game = new FlyingButtonsGame();
            game.setVisible(true);
        });
    }
}