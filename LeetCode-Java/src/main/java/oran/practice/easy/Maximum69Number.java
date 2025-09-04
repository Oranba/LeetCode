package oran.practice.easy;

/**
 * You are given a positive integer num consisting only of digits 6 and 9.
 *
 * Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
 *
 *
 * Example 1:
 *
 * Input: num = 9669
 * Output: 9969
 * Explanation:
 * Changing the first digit results in 6669.
 * Changing the second digit results in 9969.
 * Changing the third digit results in 9699.
 * Changing the fourth digit results in 9666.
 * The maximum number is 9969.
 * Example 2:
 *
 * Input: num = 9996
 * Output: 9999
 * Explanation: Changing the last digit 6 to 9 results in the maximum number.
 * Example 3:
 *
 * Input: num = 9999
 * Output: 9999
 * Explanation: It is better not to apply any change.
 */
public class Maximum69Number {
    public static int maximum69Number (int num) {
        //brute force solution
        // only 6 or 9
//        int res = 0;
//        boolean replaced = false;
//        String numAsString = String.valueOf(num);
//        int length = numAsString.length();
//        for(int i = 0; i< length; i++){
//            char left = numAsString.charAt(i);
//            if(left == '6' && !replaced){
//                res += 9 * (Math.pow(10, length-1-i));
//                replaced =true;
//            }
//            else{
//                int i1 = Integer.parseInt(String.valueOf(left));
//                res += i1 * (Math.pow(10, length -1-i));
//            }
//        }
//        return res;
        int a = -1;
        for(int n = num, d=0; n >0; n/=10, d++){
            int r = n%10; //current digit
            if(r==6){
                a=d;
            }
        }
        if(a==-1){
            return num;
        }
        else
        {
            num+=3 * Math.pow(10, a);
            return num;
        }
    }

    public static void main(String[] args) {
//        int num = 9669; //--> 9969
        int num = 9996; //--> 9999
//        int num = 9999; //--> 9999
        System.out.println(maximum69Number(num));
    }
}
