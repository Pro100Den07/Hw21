import java.util.ArrayList;
import java.util.List;

public class task5 {
    public static void main(String[] args) {
        // Заданий список цілих чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(12);

        // Елемент, який потрібно перевірити
        int target = 5;

        // Перевірка наявності елемента
        if (numbers.contains(target)) {
            System.out.println("Елемент " + target + " присутній у списку.");
        } else {
            System.out.println("Елемент " + target + " відсутній у списку.");
        }
    }
}