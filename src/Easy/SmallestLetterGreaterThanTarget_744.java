package Easy;

/**
 * <h> 34. First and Last Position of Element in a Sorted Array </h>
 * <p> You are given an array of characters letters that is sorted in non-decreasing
 * order, and a character target. There are at least two different characters in letters.
 * Return the smallest character in letters that is lexicographically greater than
 * target. If such a character does not exist, return the first character in letters. </p>
 *
 *
 * Example:
 * Input: letters = ["c","f","j"], target = "a"
 * Output: "c"
 */

public class SmallestLetterGreaterThanTarget_744 {

    public static void main(String[] args){
        SmallestLetterGreaterThanTarget_744 solution = new SmallestLetterGreaterThanTarget_744();
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(solution.nextGreatestLetter(letters, target)); //expected: c
    }

    public char nextGreatestLetter(char[] letters, char target) {
        // create pointers for both ends of the array
        int left = 0, right = letters.length-1;
        // variable to store the current smallest letter greater than target
        char ans = letters[0];


        while (left <= right){
            // get the mid-point of the search area
            int mid = left + (right-left)/2;

            // if the letter at the middle of the area is greater than target
            if (letters[mid] > target){
                // set the current smallest letter greater than target as the middle element of search area
                ans = letters[mid];
                // set the right edge of the search area to mid index-1
                right = mid-1;
            } else {
                // otherwise set the left edge of the search area to mid index+1
                left = mid+1;
            }
        }


        return ans;
    }
}
