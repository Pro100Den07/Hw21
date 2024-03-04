import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введіть операцію (+, -, *, /):");
        String operation = scanner.next();

        System.out.println("Введіть друге число:");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Помилка: ділення на нуль");
                    return;
                }
                break;
            default:
                System.out.println("Невірна операція");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
