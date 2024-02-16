public class Hw10_5 {
    public static String[] convertToArray(String input) {
        return input.split("\\s+");
    }

    public static void main(String[] args) {
        String input = "hello world";
        String[] result = convertToArray(input);
        for (String word : result) {
            System.out.println(word);
        }
    }
}
