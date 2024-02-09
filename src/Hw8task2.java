public class Hw8task2 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(" fibonacci for n=" + n + " = " + fibonacci(n));
    }
}