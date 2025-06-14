package Easy;
/**
 * <h> 704. Binary Search </h>
 * <p> Given an array of integers nums which is sorted in ascending order,
 * and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1. </p>
 *
 * <p> You must write an algorithm with O(log n) runtime complexity. </p>
 *
 * Example:
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 */

public class BinarySearch_704 {

    public static void main(String[] args){
        BinarySearch_704 solution = new BinarySearch_704();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(solution.binarySearch(nums, target)); // expected: 4
    }

    public int binarySearch(int[] nums, int target){
        // set up variables to store the left and right indexes of the search range
        int left = 0, right = nums.length-1;

        while (left <= right){
            // calculate the index of the midpoint of the search range
            int mid = left + ((right - left) / 2);

            // if the value at the midpoint is equal to the target
            if (nums[mid] == target){
                // return the index of the midpoint
                return mid;
            // if the value at the midpoint is greater than the target
            } else if (nums[mid] > target){
                // set the right edge of the search range to be mid-1
                right = mid-1;
            // if the value at the midpoint is less than the target
            } else {
                // then set the left edge of the search range to be mid+1
                left = mid+1;
            }
        }

        // if the target isn't found, return -1
        return -1;
    }

}
