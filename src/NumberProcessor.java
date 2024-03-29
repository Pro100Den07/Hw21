import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberProcessor {
    private List<Integer> numbers = new ArrayList<>();

    public void enterNumbersFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть числа у список (для завершення введення введіть 'done'):");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("done")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Невірний формат числа. Спробуйте ще раз.");
            }
        }
    }

    public int sumOfEvenNumbers() {
        return numbers.stream().filter(num -> num % 2 == 0).reduce(0, Integer::sum);
    }

    public List<Integer> multiplyByTwo() {
        return numbers.stream().map(num -> num * 2).collect(Collectors.toList());
    }

    public int findMaxNumber() {
        return numbers.stream().max(Integer::compare).orElse(0);
    }

    public String oddNumbersAsString() {
        return numbers.stream().filter(num -> num % 2 != 0).map(Object::toString).collect(Collectors.joining(", "));
    }

    public double calculateAverage() {
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();

        processor.enterNumbersFromConsole();

        System.out.println("Сума всіх парних чисел: " + processor.sumOfEvenNumbers());
        System.out.println("Результат множення кожного числа на 2: " + processor.multiplyByTwo());
        System.out.println("Максимальне число: " + processor.findMaxNumber());
        System.out.println("Непарні числа: " + processor.oddNumbersAsString());
        System.out.println("Середнє арифметичне: " + processor.calculateAverage());
    }
}