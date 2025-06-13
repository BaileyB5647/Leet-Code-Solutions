package Easy;


/**
 * <h> 1732. Find the Highest Altitude </h>
 * <p> There is a biker going on a road trip. The road trip consists of n + 1
 * points at different altitudes. The biker starts his trip on point 0 with
 * altitude equal 0. You are given an integer array gain of length n where gain[i]
 * is the net gain in altitude between points i and i + 1 for all (0 <= i < n).
 * Return the highest altitude of a point. </p>
 *
 * Example:
 * Input: gain = [-5,1,5,0,-7]
 * Output: 1
 */

public class FindHighestAltitude_1732 {
    public static void main(String[] args) { // for testing purposes
        FindHighestAltitude_1732 solution = new FindHighestAltitude_1732();
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(solution.findHighestAltitude(gain));// expected output: 1

    }

    public int findHighestAltitude(int[] gain){
        int currAlt = 0; // stores current altitude, starts at 0
        int maxAlt = 0; // stores highest altitude seen so far, starts at 0

        // for every value in gain
        for (int i = 0; i < gain.length; i++){
            // add that value to the current altitude
            currAlt += gain[i];


            // if current altitude is now greater than maximum altitude
            if (currAlt > maxAlt){
                // then set maxAlt to current altitude
                maxAlt = currAlt;
            }
        }

        // return the highest altitude seen
        return maxAlt;
    }
}
