package Medium;

import java.util.*;

/**
 * <h>49. Group Anagrams</h>
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *</p>
 * Explanation:
 * There is no string in strs that can be rearranged to form "bat".
 * The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
 * The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 */

public class GroupAnagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> anagrams = new HashMap();
        ArrayList<List<String>> anagramsOut = new ArrayList<>();

        // for every string in the input array
        for (String string : strs){
            char[] chars = string.toCharArray(); // get the characters in the string
            Arrays.sort(chars); // sort the array
            String key = String.valueOf(chars); // create a string of the sorted characters


            // if the HashMap doesn't contain the key
            if (!anagrams.containsKey(key)){
                // create a new element in the array
                anagrams.put(key, new ArrayList<>());
            }
            // add the string to the array found at key
            anagrams.get(key).add(string);
        }

        // for every key in the key set
        for (String key : anagrams.keySet()){
            // get the list at that key, and add it to the out array
            anagramsOut.add(anagrams.get(key));
        }

        return anagramsOut;
    }
}
