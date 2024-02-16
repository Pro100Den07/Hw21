public class Hw10_1 {
    public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverse(input);
        System.out.println(reversed);
    }
}
