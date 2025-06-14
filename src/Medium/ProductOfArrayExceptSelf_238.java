package Medium;

import java.util.Arrays;

/**
 * <h> 238. Product of Array Self </h>
 * <p>Given an integer array nums, return an array answer such that answer[i]
 * is equal to the product of all the elements of nums except nums[i]. </p>
 *
 * <p>The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer. </p>
 *
 * <p> You must write an algorithm that runs in O(n) time and without using the
 * division operation.</p>
 *
 * Example:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 */

public class ProductOfArrayExceptSelf_238 {

    public static void main(String[] args){
        ProductOfArrayExceptSelf_238 solution = new ProductOfArrayExceptSelf_238();
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(solution.productExceptSelf(nums))); // expected: [24, 12, 8, 6]
    }

    public int[] productExceptSelf(int[] nums) {
        // create an array that will store the output
        int[] exceptSelf = new int[nums.length];

        // the product of items left of the current item
        int productLeft = 1;
        // the product of items to the right of the current item
        int rightProduct = 1;


        // for every number in nums
        for (int i = 0; i < nums.length; i++){
            // set the values in exceptSelf to the value of productLeft
            exceptSelf[i] = productLeft;
            // multiply productLeft by the value at nums[i]
            productLeft *= nums[i];
        }

        // start from the right edge of the array and move left
        for (int i = nums.length-1; i >= 0; i--){
            // multiply the value at i in exceptSelf by the value of productRight
            exceptSelf[i] *= rightProduct;
            // multiply productRight by the value at nums[i]
            rightProduct *= nums[i];
        }

        // return the completed array of products
        return exceptSelf;
    }
}
