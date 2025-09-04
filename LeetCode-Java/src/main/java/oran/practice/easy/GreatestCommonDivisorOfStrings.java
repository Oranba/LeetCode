package oran.practice.easy;

public class GreatestCommonDivisorOfStrings {
    /**
     * Finds the greatest common divisor (GCD) of two strings.
     * The GCD is the longest string that can be concatenated to form both input strings.
     *
     * @param str1 the first string
     * @param str2 the second string
     * @return the GCD of the two strings, or an empty string if no GCD exists
     */
    public static String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }
        if (str2.isEmpty()) {
            return str1;
        }
        if (!str1.startsWith(str2)) {
            return "";
        }
        return gcdOfStrings(str1.substring(str2.length()), str2);
    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2)); // Output: "ABC"

//        String str1 = "ABABAB";
//        String str2 = "ABAB";
//        System.out.println(gcdOfStrings(str1, str2)); // Output: "AB"
    }
}
