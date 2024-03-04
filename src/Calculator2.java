import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator2 extends JFrame {

    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, subButton, mulButton, divButton;

    public Calculator2() {
        setTitle("Калькулятор");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        num1Field = new JTextField();
        num2Field = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('+');
            }
        });

        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('-');
            }
        });

        mulButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('*');
            }
        });

        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('/');
            }
        });

        add(new JLabel("Число 1:"));
        add(num1Field);
        add(new JLabel("Число 2:"));
        add(num2Field);
        add(new JLabel("Результат:"));
        add(resultField);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
    }

    private void calculate(char operation) {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    resultField.setText("Помилка: ділення на нуль");
                    return;
                }
                break;
        }

        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculator2().setVisible(true);
            }
        });
    }
}