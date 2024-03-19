import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Секундомір");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Час: 0 с");
        frame.add(label);

        Timer timer = new Timer(1000, new ActionListener() {
            int seconds = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                seconds++;
                label.setText("Час: " + seconds + " с");
            }
        });

        timer.start();

        frame.pack();
        frame.setVisible(true);
    }
}