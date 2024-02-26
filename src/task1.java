import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        // Заданий список цілих чисел
        Integer[] numbers = {5, 2, 8, 3, 1, 7};

        // Сортування за зростанням
        Arrays.sort(numbers);
        System.out.println("Сортування за зростанням: " + Arrays.toString(numbers));

        // Сортування за спаданням
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Сортування за спаданням: " + Arrays.toString(numbers));
    }
}