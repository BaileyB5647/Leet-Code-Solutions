package Easy;

import java.util.HashSet;
import java.util.Stack;

/**
 * <h> 345. Reverse Vowels of a String </h>
 * <p> Given a string s, reverse only all the vowels in the string and return it.</p>
 *
 * <p> The vowels are 'a', 'e', 'i', 'o', and 'u',
 * and they can appear in both lower and upper cases, more than once. </p>
 *
 * <h2> Idea: </h2>
 * <p> Add the vowels to a stack and then pop them off to get them in reverse order</p>
 *
 * Example:
 * Input: s = "IceCreAm"
 * Output: "AceCreIm"
 */

public class ReverseVowelsString_345 {

    public static void main(String[] args){
        ReverseVowelsString_345 solution = new ReverseVowelsString_345();
        String s = "IceCreAm";
        System.out.println(solution.reverseVowels(s)); //expected: "AceCreIm"
    }

    public String reverseVowels(String s) {
        // create a hash set to store all possible vowels
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('e');
        vowels.add('a');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        // create a stack to store the discovered vowels
        Stack<Character> stack = new Stack<>();

        // string builder to create the output string
        StringBuilder output = new StringBuilder();

        // for every character in the string
        for (int i = 0; i < s.length(); i++){
            // if the character is a vowel
            if (vowels.contains(s.charAt(i))){
                // add it to the stack
                stack.push(s.charAt(i));
            }
        }

        // for every character in the string
        for (int i = 0; i < s.length(); i++){
            // if the character is a vowel
            if (vowels.contains(s.charAt(i))){
                // pop the item off the top of the stack and add it to the output sting
                output.append(stack.pop());
            } else {
                // otherwise just add the character to the output string
                output.append(s.charAt(i));
            }
        }

        // return the output as a String, not StringBuilder
        return output.toString();
    }
}
