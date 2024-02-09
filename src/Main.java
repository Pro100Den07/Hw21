//1
public class Main {
    public static void main(String[] args) {
        int[] ar = {5, 2, 9, 1, 5, 6};
        System.out.println("start array: ");
        printArray(ar);

        insertionSort(ar);

        System.out.println("sorted array: ");
        printArray(ar);
    }

    public static void insertionSort(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int current = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j] > current) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = current;
        }
    }

    public static void printArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}
//git init
//git add .
//git commit -m "first commit"
//git remote add origin https://github.com/Pro100Den07/Hw8.git
//git push -u origin main
