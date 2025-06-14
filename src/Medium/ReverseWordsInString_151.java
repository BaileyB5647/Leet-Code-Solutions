package Medium;

/**
 * <h> 151. Reverse Words in a String </h>
 * <p> Given an input string s, reverse the order of the words.</p>
 *
 * <p> A word is defined as a sequence of non-space characters. The words
 * in s will be separated by at least one space. </p>
 *
 * <p> Return a string of the words in reverse order concatenated by a single space. </p>
 *
 * <p> Note that s may contain leading or trailing spaces or multiple spaces between
 * two words. The returned string should only have a single space separating the words.
 * Do not include any extra spaces.</p>
 *
 * Example:
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 */

public class ReverseWordsInString_151 {

    public static void main(String[] args){
        ReverseWordsInString_151 solution = new ReverseWordsInString_151();
        String s = "the sky is blue";
        System.out.println(solution.reverseWords(s)); //expected: "blue is sky the"
    }

    public String reverseWords(String s) {
        // a string builder to store the reversed string
        StringBuilder reversedString = new StringBuilder();

        // remove the trailing and leading spaces:
        s = s.strip();

        // split the words by the spaces and add them to the array
        String[] words = s.split(" ");

        // for every word in the string starting from the right
        for (int i = words.length-1; i >= 0; i--){
            // as long as the length of that word stripped isn't zero (i.e. it wasn't a space)
            if (words[i].strip().length() != 0){
                // add the word to the end of the array, so they will be reversed
                reversedString.append(words[i]);
                // add a space after every word
                reversedString.append(" ");
            }
        }

        // return the reversedString as a string with no trailing or leading spaces
        return reversedString.toString().strip();
    }
}
