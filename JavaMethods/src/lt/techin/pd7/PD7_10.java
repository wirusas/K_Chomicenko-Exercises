/**
 * Parašykite Java metodą, kuris konvertuoja pateiktos eilutės kiekvieno žodžio pirmąją raidę į didžiąsias raides.
 */

package lt.techin.pd7;

import java.util.Arrays;

public class PD7_10 {
    public static void main(String[] args) {
        // TODO
        String text = "hello     world    How are You ";
        System.out.println(capitalizeFirstCharOfWord(text));

        //bandymas
        StringBuilder stringBuilder = new StringBuilder();

    }
    private static String capitalizeFirstCharOfWord(String text) {
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase((word.charAt(0))));
                result.append(word.substring(1));
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
}
