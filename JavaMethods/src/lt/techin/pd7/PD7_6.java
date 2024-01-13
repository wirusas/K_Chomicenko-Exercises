/**
 * Parašykite Java metodą, kuris skaičiuoja kiek yra raidžių pateiktoje eilutėje.
 */

package lt.techin.pd7;

import java.util.Arrays;

public class PD7_6 {
    public static void main(String[] args) {
        String text = "Labas kaip?";
        int charCount = lineCharCount(text);
        System.out.println("LETTERS IN LINE: " + charCount);

        int charCount2 = lineCharCounter2(text);
        System.out.println("CHARACTERS IN LINE NO SPACES: " + charCount2);
    }

    //METHOD 1 COUNTS ONLY LETTERS
    public static int lineCharCount(String text) {
        int charCounter = 0;
        for (int i = 0; i < text.length(); i++) {
            char tempChar = text.charAt(i);
            if (Character.isLetter(tempChar)) {
                charCounter++;
            }
        }
        return charCounter;
    }

    //METHOD 2 COUNTS ALL CHARACTERS EXEPT  SPACES
    public static int lineCharCounter2(String text) {
        char[] charArray = text.toCharArray();
        int charCounter = 0;

        for (int c : charArray) {
            if (Character.isSpaceChar(c)) {
                charCounter++;
            }
        }
        return text.length() - charCounter;
    }
}
