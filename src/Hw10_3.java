public class Hw10_3 {
    public static boolean isPalindrome(String input) {
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            if (clean.charAt(forward) != clean.charAt(backward)) {
                return false;
            }
            forward++;
            backward--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "level";
        if (isPalindrome(input)) {
            System.out.println(input + " - it's Palindrome");
        } else {
            System.out.println(input + " - It's not Palindrome");
        }
    }
}

