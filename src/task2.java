import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        // Заданий список рядків
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("apple");
        strings.add("kiwi");
        strings.add("banana");

        // Видалення дублікатів
        HashSet<String> uniqueStrings = new HashSet<>(strings);
        List<String> result = new ArrayList<>(uniqueStrings);
        System.out.println("Унікальні рядки: " + result);
    }
}