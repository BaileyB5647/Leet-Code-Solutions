package Easy;

/**
 * <h> 283. Move Zeroes </h>
 * <p> Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements. </p>
 *
 * <p> >Note that you must do this in-place without making a copy of the array.</p>
 *
 * Example:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */

public class MoveZeroes_283 {

    public void moveZeroes(int[] nums) {
        // create a pointer to use when iterating through the array
        int pointer = 0;

        // create a counter to store the number of 0s in the array
        int counter = 0;


        // while the pointer is < length of the array - the number of zeroes found so far
        // (we subtract number of zeroes found so as not to enter the
        // part of the array where the zeroes have been moved to)
        while (pointer < nums.length - counter){
            // if the number at the pointer is 0
            if (nums[pointer] == 0){
                // call the function to remove the zero
                nums = removeZero(nums, pointer);
                // set the value at the end of the array to 0
                nums[nums.length-1] = 0;
                // increment the counter of the number of 0s
                counter++;
            } else {
                // otherwise increment the pointer
                pointer++;
            }
        }
    }

    // This is a function to shift all numbers to the left by one in an array from a specified index
    public int[] removeZero(int[] intArray, int index){
        // for every number in the intArray, from index onwards
        for (int i = index; i < intArray.length-1; i++){
            // set the value of this index to the value stored in the next index
            intArray[i] = intArray[i+1];
        }
        return intArray;
    }
}
