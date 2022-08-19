import java.util.Scanner;

public class Reverse {
    /**
     * Reverses string in place
     * @param word input string to be reversed
     * this method swaps characters from either end of the string buffer
     * to reverse it and does not return anything.
     */
    public static void reverseInPlace(StringBuffer word) {
        for (int i = 0; i < word.length() / 2; i++) {
            char temp = word.charAt(i);
            word.setCharAt(i, word.charAt(word.length() - i - 1));
            word.setCharAt(word.length() - i - 1, temp);
        }
    }
    /**
     * Reverses a string
     * @param word a string of any length, possibly empty
     * @return a string with its character placed in reverse order of the input
     */
    public static String reverse(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Reversing string in place using StringBuffer");
        System.out.println("********************************************\n");
        StringBuffer word = new StringBuffer();
        word.append(scan.nextLine());
        reverseInPlace(word);
        System.out.println(word);
        System.out.println("\nReversing a string into anther object");
        System.out.println("*****************************************\n");
        String anotherword = scan.nextLine();
        System.out.println(reverse(anotherword));
    }
}
