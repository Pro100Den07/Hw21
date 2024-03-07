import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimplePaint extends JFrame {
    private int x1, y1, x2, y2;
    private Color currentColor = Color.BLACK;

    public SimplePaint() {
        setTitle("Simple Paint");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN); // Зміна коліру фону на блакитний
        panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }
            public void mouseReleased(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();
                Graphics g = panel.getGraphics();
                g.setColor(currentColor);
                g.drawLine(x1, y1, x2, y2);
            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.repaint(); // Очищення малюнка
            }
        });

        JButton colorButton = new JButton("Change Color");
        colorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentColor = JColorChooser.showDialog(null, "Choose a color", currentColor); // Вибір нового кольору
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(clearButton);
        buttonPanel.add(colorButton);

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimplePaint().setVisible(true);
            }
        });
    }
}