import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        // Заданий список цілих чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(12);

        // Знаходження найбільшого та найменшого чисел
        int maxNumber = Collections.max(numbers);
        int minNumber = Collections.min(numbers);

        System.out.println("Найбільше число: " + maxNumber);
        System.out.println("Найменше число: " + minNumber);
    }
}