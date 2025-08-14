package arrays;

public class printArray {
    public static void main(String[] args) {
        int[] example1 = {2, 4, 6, 8, 10};
        println(example1);

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

}
