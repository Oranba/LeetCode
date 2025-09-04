package oran.practice.easy;

/**
 * Given an integer x, return true if x is a palindrome and false otherwise Examples: 1) Input: x=
 * 121 Output = true 2) Input: x = -121 Output: false 3) Input: x = 10 Output: false
 * 
 * Constraint: Need to solve without converting int to String
 * 
 */
public class PalindromeNumber {
    public static boolean isPalindrome (int x) {

        // Brut force solution by converting int to String
        // String xAsString = String.valueOf(x);
        // int left = 0;
        // int right = xAsString.length()-1;
        //
        // while (left < right){
        // if(xAsString.charAt(left) != xAsString.charAt(right)){
        // return false;
        // }
        // left++;
        // right--;
        // }
        // return true;

        // Optimal solution without converting int to String TC: O(log10X) SC: O(1)
        // 121

        // x is negative or (x is not zero and x is end with zero)
        if (x < 0) {
            return false;
        }
        // x % 10 -> will give us the last digit
        if (x != 0 && x % 10 == 0) {
            return false;
        }

        int reverse = 0;
        while (x > reverse) {
            // get the last digit
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        return  (x == reverse || (x == reverse / 10));
    }

    public static void main (String[] args) {
        int x = 12421;
        boolean palindrome = isPalindrome(x);
        System.out.println(palindrome);
    }
}
