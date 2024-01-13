/**
 * Parašykite Java metodą, kuris suranda ilgiausią žodį pateiktoje eilutėje.
 */

package lt.techin.pd7;

import java.util.Arrays;

public class PD7_11 {
    public static void main(String[] args) {
        String myString = "I like coding JAVA";
        System.out.println(longesWordInLine(myString));
        // TODO
    }

    public static String longesWordInLine(String text) {
        String[] tempString = text.split(" ");
        String longestWord = tempString[0];
        for (String word : tempString) {
            if (word.length() > longestWord.length())
                longestWord = word;
        }
        return "I am the longest word in the line: " + longestWord;
    }
}
