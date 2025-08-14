package arrays;

public class printArray {
    /* To print the values in an array, you can use a for loop or a for-each loop.
    & PRINTING AN ARRAY IN REVERSE.
     */
    public static void main(String[] args) {
        int[] example1 = {2, 4, 6, 8, 10};
        println(example1);
        reverse(example1);

    }

    /**
     * This method prints out the values of the array on one line with only spaces between them.
     * Then brings the cursor down to the next line.
     * @param seq - an integer array
     */
    public static void println(int[] seq) {
        for (int i=0; i<seq.length; i++) {
            System.out.print(seq[i]);
            if (i<seq.length-1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    /**
     * Reverse an array
     * @param seq - random integer array
     */
    public static void reverse(int[] seq){
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
