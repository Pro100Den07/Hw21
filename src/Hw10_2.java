public class Hw10_2 {
    public static int countVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "hello world";
        int vowelCount = countVowels(input);
        System.out.println("number of vowels: " + vowelCount);
    }
}

