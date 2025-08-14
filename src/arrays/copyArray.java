package arrays;

public class copyArray {
    // This class focuses on creating a copy of an array.

    public static void main(String[] args) {
        int[] example1 = {2, 4, 6, 8, 10};
        copy(example1);
    }

    public static void copy(int[] seq) {
        int[] copy = new int[seq.length];
        for (int i = 0; i < seq.length; i++) {
            copy[i] = seq[i];
        }

        for (int n : copy) {
            System.out.print(n + " ");
        }
    }
}
