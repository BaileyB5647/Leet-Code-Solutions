package Easy;


/**
 * <h> 35. Search Insert Position </h>
 * <p> Given a sorted array of distinct integers and a target value,
 * return the index if the target is found. If not, return the index
 * where it would be if it were inserted in order.</p>
 *
 * <p> You must write an algorithm with O(log n) runtime complexity. </p>
 *
 *  <h2> Idea: Binary Search </h2>
 *  <p> The array will already be sorted. Binary Search will meet the runtime complexity
 *  requirements. </p>
 * Example:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 */
public class SearchInsertPosition_35 {

    public static void main(String[] args){
        SearchInsertPosition_35 solution = new SearchInsertPosition_35();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(solution.searchInsert(nums, target)); // expected: 2
    }

    public int searchInsert(int[] nums, int target){
        // set up the variables to store edge indexes of the search range
        int start = 0, end = nums.length-1;


        while (start <= end){
            // calculate the middle index of the search range
            int mid = start + (end-start) / 2;

            // if the value at the middle of the search range is the target
            if (nums[mid] == target) {
                // return the index of the mid-point
                return mid;
            // if the value at the middle of the search range is less than the target
            } else if (nums[mid] < target){
                // set the left edge of the search range to be middle index +1;
                start = mid+1;
            // otherwise: the value at the middle is greater than the target
            } else {
                // so set the right edge of the search range to be the middle index -1
                end = mid-1;
            }
        }

        // return the index that would store the target:
        // which will be the index stored in start
        return start;
    }
}
