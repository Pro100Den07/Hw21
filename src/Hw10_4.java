import java.util.LinkedHashSet;
public class Hw10_4 {
        public static String removeDuplicates(String input) {
            LinkedHashSet<Character> set = new LinkedHashSet<>();
            for (char ch : input.toCharArray()) {
                set.add(ch);
            }
            StringBuilder result = new StringBuilder();
            for (Character ch : set) {
                result.append(ch);
            }
            return result.toString();
        }

        public static void main(String[] args) {
            String input = "hello";
            String result = removeDuplicates(input);
            System.out.println("Result: " + result);
        }
    }

