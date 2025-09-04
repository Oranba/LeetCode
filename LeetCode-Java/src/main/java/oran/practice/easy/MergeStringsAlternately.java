package oran.practice.easy;

public class MergeStringsAlternately {
    /**
     * Merges two strings by alternating characters from each string. If one string is longer, the
     * remaining characters are appended at the end.
     *
     * @param word1
     *        the first string
     * @param word2
     *        the second string
     * @return the
     *
     *         merged string
     */
    public static String mergeAlternately (String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();
        int minLength = Math.min(length1, length2);

        // Merge characters from both strings
        for (int i = 0; i < minLength; i++) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
        }

        // Append remaining characters from the longer string
        if (length1 > minLength) {
            merged.append(word1.substring(minLength));
        }
        else if (length2 > minLength) {
            merged.append(word2.substring(minLength));
        }

        return merged.toString();
    }

    public static void main (String[] args) {
        String word1 = "abc";
        String word2 = "pqrstu";
        String result = mergeAlternately(word1, word2);
        System.out.println(result); // Output: "apbqrcstu"
    }
}
