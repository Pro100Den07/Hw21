import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class task4 {
    public static void main(String[] args) {
        // Задані два списки цілих чисел
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);

        // Об'єднання списків без дублікатів
        HashSet<Integer> set = new HashSet<>();
        set.addAll(list1);
        set.addAll(list2);

        List<Integer> mergedList = new ArrayList<>(set);
        System.out.println("Об'єднаний список без дублікатів: " + mergedList);
    }
}