package arrays;

public class swapArray {
    // TO PRINT THE VALUES OF AN ARRAY IN REVERSE
    public static void main(String[] args) {
        int[] example1 = {2, 4, 6, 8, 10};
        swap(example1);
    }


    /**
     * Reverse an array
     * @param seq - random integer array
     */
    public static void swap(int[] seq){
        if (seq == null || seq.length < 2) {
            throw new IllegalArgumentException("The array must contain two or more value");
        } else {
            for (int i = 0; i <= seq.length/2; i++) {
                int temp = seq[i];
                seq[i] = seq[(seq.length - 1) - i];
                seq[(seq.length - 1) - i] = temp;
            }

            for (int n : seq) {
                System.out.print(n + " ");
            }
        }
    }
}
