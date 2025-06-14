package Medium;

import java.util.Arrays;

/**
 * <h> 1679. Max Number of K-Sum Pairs </h>
 * <p> You are given an integer array nums and an integer k.
 * In one operation, you can pick two numbers from the array whose sum equals k
 * and remove them from the array. Return the maximum number of operations
 * you can perform on the array. </p>
 *
 * Example:
 * Input: nums = [1,2,3,4], k = 5
 * Output: 2
 */

public class MaxNumOfKSumPairs_1679 {

    public static void main(String[] args){
        MaxNumOfKSumPairs_1679 solution = new MaxNumOfKSumPairs_1679();
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        System.out.println(solution.maxOperations(nums, k)); //expected: 2
    }

    public int maxOperations(int[] nums, int k){
        // sort the array
        Arrays.sort(nums);
        // create counter to store the number of operations that can be completed
        int counter = 0;
        // create the left and right pointers
        int leftPointer = 0, rightPointer = nums.length-1;

        // while the left pointer is less than the right pointer
        while (leftPointer < rightPointer){
            // if the value at leftPointer + value at rightPointer is equal to k
            if (nums[leftPointer] + nums[rightPointer] == k){
                // increment the left pointer
                leftPointer++;
                // decrement the right pointer
                rightPointer--;
                // increment the counter as another operation can be completed
                counter++;
            // else if the value at leftPointer + value at rightPointer is less than k
            } else if (nums[leftPointer] + nums[rightPointer] < k){
                // increment the leftPointer (as the array is sorted, this will increase sum)
                leftPointer++;
            // else the value at leftPointer + value at rightPointer is greater than k
            } else {
                // so decrement the rightPointer (as this will decrease the sum)
                rightPointer--;
            }
        }
        // return the number of operations that can be completed
        return counter;


    }
}
