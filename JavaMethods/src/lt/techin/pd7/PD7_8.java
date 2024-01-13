/**
 * Parašykite Java metodą, kuris patikrina ar teksto eilutė yra palindromas, ar ne?
 */

package lt.techin.pd7;

public class PD7_8 {
    public static void main(String[] args) {
        // TODO
        String text = "ban111n1ab";
        System.out.println(isPalindrome(text));
    }

    private static boolean isPalindrome(String text) {

        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
