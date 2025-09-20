package oran.practice.medium;

import java.util.*;

/**
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
    //Sliding window
        int left =0;
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        for(int right =0; right<s.length();right++){
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(right));
                left++;
            }
            charSet.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        //use case 1:
//        System.out.println(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        //use case 2:
      //  System.out.println(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbbb"));
        //use case 3:
        System.out.println(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
        //use case 3:
//        System.out.println(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("dvdf"));
    }
}
