package Easy;

/**
 * <h> 724. Find Pivot Index </h>
 * <p> Given an array of integers nums, calculate the pivot index of this array.
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 * Return the leftmost pivot index. If no such index exists, return -1. </p>
 *
 * Example:
 * Input: nums = [1,7,3,6,5,6]
 * Output: 3
 */

public class FindPivotIndex_724 {


    public static void main(String[] args) { // for testing purposes
        FindPivotIndex_724 solution = new FindPivotIndex_724();
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(solution.findPivotIndex(nums)); // expected output: 3

    }

    public int findPivotIndex(int[] nums){
        int leftSum = 0;
        int rightSum = 0;

        // calculate the right sum;
        for (int num : nums){
            rightSum += num;
        }

        // for every number in nums
        for (int i = 0; i < nums.length; i++){
            // remove the current num from the rightSum
            rightSum -= nums[i];

            // if sum of left == sum of right
            if (leftSum == rightSum){
                // then return i as the pivot index
                return i;
            }

            // otherwise add current num to the left sum
            leftSum += nums[i];
        }

        // if no pivot index exists then return -1
        return -1;
    }

}
