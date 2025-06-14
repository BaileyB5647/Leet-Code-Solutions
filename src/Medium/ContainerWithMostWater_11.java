package Medium;

/**
 * <h> 11. Container With Most Water </h>
 * <p> You are given an integer array height of length n. There are n vertical lines
 * drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the
 * container contains the most water. </p>
 *
 * <p> Return the maximum amount of water a container can store.
 * Notice that you may not slant the container. </p>
 *
 * Example:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 */

public class ContainerWithMostWater_11 {

    public static void main(String[] args){
        ContainerWithMostWater_11 solution = new ContainerWithMostWater_11();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(height)); // expected: 49
    }

    public int maxArea(int[] height){
        // initialise pointers at each end of the array
        int leftPointer = 0, rightPointer = height.length-1;

        // store the maximum area found so far
        int maxArea = 0;


        while (leftPointer < rightPointer){
            // get the minimum height of the two values at the pointers the water
            // will overflow any higher so this is the "true" height of the container
            int minHeight = Math.min(height[leftPointer], height[rightPointer]);

            // get the width of the container
            int width = rightPointer - leftPointer;

            // if the maximum area found is less than the current area
            if (maxArea < minHeight * width){
                // then set the maximum area found to the current area
                maxArea = minHeight * width;
            }

            // if the height at the left pointer is less than the height at the right pointer
            if (height[leftPointer] < height[rightPointer]){
                // increment the left pointer
                leftPointer++;
            } else {
                // decrement the right pointer
                rightPointer--;
            }
        }

        return maxArea;

    }


}
