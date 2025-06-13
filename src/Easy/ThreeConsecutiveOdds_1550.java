package Easy;

public class ThreeConsecutiveOdds_1550 {
    /**
     * 1550. Three Consecutive Odds
     * Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
     * -
     * Example:
     * Input: arr = [2,6,4,1]
     * Output: false
     *
     *
     */

    public static void main(String[] args){ // for testing purposes
        ThreeConsecutiveOdds_1550 solution = new ThreeConsecutiveOdds_1550();
        int[] inputArr = {2, 6, 4, 1};
        System.out.println(solution.threeConsecutiveOdds(inputArr)); // expected output: false
    }

    public boolean threeConsecutiveOdds(int[] arr){
        int count = 0;

        // for every number in the array
        for (int num : arr){
            // if that number is even
            if (num % 2 != 0){
                // then increment the counter
                count++;

                // if the counter reaches three, return true
                if (count == 3){
                    return true;
                }
            // if the number is not even
            } else {
                // then reset the counter
                count = 0;
            }
        }
        // otherwise return false
        return false;
    }



}
