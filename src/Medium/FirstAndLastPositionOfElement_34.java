package Medium;

import java.util.Arrays;

/**
 * <h> 34. First and Last Position of Element in a Sorted Array </h>
 * <p> Given an array of integers nums sorted in non-decreasing order, find the
 * starting and ending position of a given target value. If target is not found in
 * the array, return [-1, -1]. </p>
 *
 * <p> You must write an algorithm with O(log n) runtime complexity.</p>
 *
 *
 * <h2> Idea: Binary Search</h2>
 *
 * Example:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 */

public class FirstAndLastPositionOfElement_34 {

    public static void main(String[] args){
        FirstAndLastPositionOfElement_34 solution = new FirstAndLastPositionOfElement_34();
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(solution.searchRange(nums, target)));
    }

    public int[] searchRange(int[] nums, int target) {
        // set the initial array range to {-1, -1}
        int[] range = {-1, -1};
        // initialise pointers
        int left = 0, right = nums.length-1;
        // calculate the middle index of the search range
        int mid = left + (right-left)/2;

        // while left less than equal to right
        while (left <= right){
            // recalculate the middle index of the search range
            mid = left + (right-left)/2;

            // if the value at the middle of the search range is equal to the target
            if (nums[mid] == target){
                // break the loop
                break;
            // otherwise if the value at the middle of the search range is less than the target
            } else if (nums[mid] < target){
                // set the left edge of the search range to mid+1
                left = mid+1;
            } else {
                //otherwise set the right edge of the search range to mid-1
                right = mid-1;
            }
        }


        // create two new pointers initialised to mid
        int leftP = mid, rightP = mid;

        // if the length of nums is equal to 0, the target cannot be in the array,
        // or if the value at nums[mid] is not the target, the target is not in the array
        if (nums.length == 0 || nums[mid] != target){
            // so return {-1, -1}
            return range;
        }

        // to find the left edge of the range where the target is present:
        // while leftP >= 0 and the value of nums[leftP] == target
        while (leftP >= 0 && nums[leftP] == target){
            // decrement the left pointer
            leftP--;
        }

        // set the left edge of the range in output array to leftP+1
        range[0] = leftP+1;

        // to find the right edge of the range where the target is present:
        // while rightP < the length of nums and the value of nums[rightP] == target
        while (rightP < nums.length && nums[rightP] == target){
            // increment the right pointer
            rightP++;
        }

        // set the right edge of the range in output array to rightP-1
        range[1] = rightP-1;

        return range;
    }


}
