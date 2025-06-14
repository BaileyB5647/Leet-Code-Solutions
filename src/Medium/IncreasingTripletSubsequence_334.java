package Medium;

/**
 * <h> 334. Increasing Triplet Subsequence </h>
 * <p> Given an integer array nums, return true if there exists a triple
 * of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k].
 * If no such indices exists, return false </p>
 *
 * Example:
 * Input: nums = [1,2,3,4,5]
 * Output: true
 */

public class IncreasingTripletSubsequence_334 {

    public static void main(String[] args){
        IncreasingTripletSubsequence_334 solution = new IncreasingTripletSubsequence_334();
        int[] nums = {1,2,3,4,5};
        System.out.println(solution.increasingTriplet(nums));
    }

    public boolean increasingTriplet(int[] nums){
        // initialise two variables with max integer value
        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;

        // for every number in nums
        for (int num : nums){
            // if the number is less than or equal to i
            if (num <= i){
                // set i to the value of num
                i = num;
            // else if the number is less than or equal to j
            } else if (num <= j){
                // set j to the value of num
                j = num;
            // otherwise an increasing triplet has been found
            } else {
                // so return true
                return true;
            }
        }
        // if after checking all numbers no increasing triplet has been found: return false
        return false;
    }
}
