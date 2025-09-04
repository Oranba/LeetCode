package oran.practice.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"] Output: "fl" Example 2:
 *
 * Input: strs = ["dog","racecar","car"] Output: "" Explanation: There is no common prefix among the
 * input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200 0 <= strs[i].length <= 200 strs[i] consists of only lowercase English
 * letters if it is non-empty.
 *
 * Solution principles:
 * 1. Start with the first string as the initial prefix.
 * 2. Iterate through each string in the array.
 * 3. For each string, check if it starts with the current prefix.
 * 4. If it doesn't, shorten the prefix by removing the last character.
 * 5. Repeat until a common prefix is found or the prefix becomes empty.
 * 6. Return the longest common prefix found.
 *
 * The current algorithm has the following complexities:
 *
 * Time Complexity: O(S)
 *
 * Where S is the sum of all characters in all strings
 * In the worst case, we examine every character of every string once
 * The outer loop runs n-1 times (where n is the number of strings)
 * The inner while loop and startsWith() method together can examine up to m characters (where m is the length of the shortest string)
 * Overall: O(n × m) where n is the number of strings and m is the average string length, which simplifies to O(S)
 * Space Complexity: O(1)
 *
 *
 * The algorithm uses only a constant amount of extra space
 * The prefix variable stores a reference to a substring, but doesn't create new character arrays
 * No additional data structures that grow with input size are used
 * The space used is independent of the input size
 * The algorithm is quite efficient as it stops early when no common prefix is possible and uses the startsWith() method which is optimized for prefix checking.
 *
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix (String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];

        // Compare with each subsequent string
        for (int i = 1; i < strs.length; i++) {
            // Reduce prefix until it matches the beginning of current string
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // If prefix becomes empty, no common prefix exists
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;

        /*
         * int len = strs.length; //find the shortest word int minLen = strs[0].length(); StringBuilder
         * longestCommonPrefix = new StringBuilder(); for(int i=1;i<len;i++){ minLen =
         * Math.min(minLen,strs[i].length()); } StringBuilder sb = new StringBuilder(); for(int
         * j=0;j<minLen;j++){ char currentChar = strs[0].charAt(j); boolean match =true; for(int
         * k=1;k<len;k++){ if(strs[k].charAt(j)!=currentChar){ match = false; break; } } if(match){
         * sb.append(currentChar); longestCommonPrefix = sb; } else if(!sb.isEmpty() &&
         * longestCommonPrefix.length() < sb.length()){ sb = new StringBuilder(); } } return
         * longestCommonPrefix.toString();
         */
    }

    public static void main (String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] s = new String[] { "flower", "flow", "flight" };
//        String[] s = new String[] { "flower", "flower", "flower", "flower" };
        // String[] s = new String[]{"a"};
        System.out.printf("Longest common prefix: %s %n", longestCommonPrefix.longestCommonPrefix(s));

    }
}
