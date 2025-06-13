package Easy;

/**
 * <h> 643. Maximum Average Subarray I </h>
 * <p> You are given an integer array nums consisting of n elements, and an integer k.
 * Find a contiguous subarray whose length is equal to k that has the maximum
 * average value and return this value. Any answer with a calculation error less than
 * 10^-5 will be accepted. </p>
 * -
 * IDEA: Sliding Window
 * -
 * Example:
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 */

public class MaxAverageSubarray_643 {

    public static void main(String[] args){ // for testing
        MaxAverageSubarray_643 solution = new MaxAverageSubarray_643();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(solution.findMaxAverage(nums, k));
    }

    public double findMaxAverage(int[] nums, int k) {
        // running total, initialise to 0
        int total = 0;

        // initialise the total of the first k elements
        for (int i = 0; i < k; i++){
            total += nums[i];
        }

        // initialise the max total and set to total
        int maxTotal = total;


        // from every number from k to the end of the array
        for (int i = k; i < nums.length; i++){
            // remove the left end of the window from the total
            total -= nums[i - k];
            // add the new right end of the window to the total
            total += nums[i];

            // if maxTotal is less than current total
            if (maxTotal < total){
                // set max total to current total
                maxTotal = total;
            }
        }

        // return the max average as a double
        return (double) maxTotal / k;
    }
}
