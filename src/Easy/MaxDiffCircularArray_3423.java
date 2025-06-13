package Easy;

/**
 * 3423. Maximum Difference Between Adjacent Elements in a Circular Array
 * Given a circular array nums, find the maximum absolute difference between adjacent elements.
 * -
 * Note: In a circular array, the first and last elements are adjacent.
 * -
 * Example:
 * Input: [1, 3, 8, 2]
 * Output: 6
 * -
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */


public class MaxDiffCircularArray_3423 {

    public static void main(String[] args) { // for testing purposes
        MaxDiffCircularArray_3423 solution = new MaxDiffCircularArray_3423();
        int[] nums = {1, 3, 8, 2};
        System.out.println(solution.maxAdjacentDistance(nums)); // Output: 6

    }

    public int maxAdjacentDistance(int[] nums) {

        // calculate the difference between the first and last elements and store as the currentMax.
        int currentMax = Math.abs(nums[0]-nums[nums.length-1]);

        // for every element in the list
        for (int i = 0; i < nums.length-1; i++){
            // calculate the difference between it and the next element
            int diff = Math.abs(nums[i+1] - nums[i]);

            // if the difference is greater than the current max
            if (diff > currentMax){

                // set current max to diff
                currentMax = diff;
            }
        }
        return currentMax;
    }
}
