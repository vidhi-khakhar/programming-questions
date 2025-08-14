package strings;

public class reverseString {
    /* THERE ARE 3 MAIN WAYS TO REVERSE A STRING:
    1. Convert to Stringbuilder and use reverse() method
    2. Using a for-loop
    3. Convert into charArray and use a for-loop
     */

    public static void main(String[] args) {
        String example = "Hello!";
        reverseStringBuilder(example);
        reverseStringLoop(example);
    }

    // STRINGBUILDER:
    public static void reverseStringBuilder(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
    }

    // FOR-LOOP:
    public static void reverseStringLoop(String s) {
        String reversed = "";
        for(int i=s.length()-1; i >= 0 ; i--) {
            reversed += s.charAt(i); // checkstyle error: Strings are immutable, so new string created each time.
        }
        System.out.println(reversed);
    }


}
