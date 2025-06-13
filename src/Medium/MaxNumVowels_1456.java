package Medium;

import java.util.HashSet;

/**
 * <h> 1456. Maximum Number of Vowels in a Substring of Given Length </h>
 * <p> Given a string s and an integer k, return the maximum number of vowel
 * letters in any substring of s with length k.
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'. </p>
 *
 * Example:
 * Input: s = "abciiidef", k = 3
 * Output: 3
 */

public class MaxNumVowels_1456 {

    public static void main(String[] args) { // for testing purposes
        MaxNumVowels_1456 solution = new MaxNumVowels_1456();
        String s = "abciiidef";
        int k = 3;
        System.out.println(solution.maxVowels(s, k)); // expected output: 3

    }

    public int maxVowels(String s, int k){
        HashSet<Character> vowels = new HashSet<>(); // HashSet to store the vowels
        // Add the vowels to the hash set
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        // currCount to store the current number of vowels
        int currCount = 0;
        // for the first subset get the current count of vowels
        for (int i = 0; i < k; i++){
            if (vowels.contains(s.charAt(i))){
                currCount++;
            }
        }
        // initialise maximum count with initial value currCount
        int maxCount = currCount;

        // starting from k, iterate through every character in the string
        for (int i = k; i < s.length(); i++){
            // if the character just removed from the substring is a vowel
            if (vowels.contains(s.charAt(i-k))){
                // decrement the current count of vowels
                currCount--;
            }

            // if the new character added to the substring is a vowel
            if (vowels.contains(s.charAt(i))){
                // increment the current count of vowels
                currCount++;

                // if the new current count is greater than the maximum count
                if (currCount > maxCount){
                    // then set maxCount to currCount
                    maxCount = currCount;
                }
            }
        }

        return maxCount;
    }
}
