package oran.practice.easy;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "()[]{}"
 *
 * Output: true
 *
 * Example 3:
 *
 * Input: s = "(]"
 *
 * Output: false
 *
 * Example 4:
 *
 * Input: s = "([])"
 *
 * Output: true
 *
 * Example 5:
 *
 * Input: s = "([)]"
 *
 * Output: false
 *
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 *
 * Time Complexity: O(n)
 *
 * Where n is the length of the input string
 * The algorithm makes a single pass through the string using the for-each loop
 * Each character is processed exactly once
 * Stack operations (push, pop, isEmpty) are O(1)
 * The switch statement performs constant-time operations for each character
 * Space Complexity: O(n)
 *
 *
 * In the worst case, the stack can store up to n/2 characters
 * This happens when the string contains only opening brackets: "((([[[{{{"
 * The toCharArray() method creates a character array of size n
 * The counter variable uses O(1) space
 * Overall space is dominated by the stack: O(n)
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
           return false;
        }
        //Stack<Character> stack = new Stack<>();
        char[] stack = new char[s.length()];
        int counter = 0;
        for(char c : s.toCharArray()){
            switch(c){
                case '(', '[', '{' -> {
                    //stack.push(c);
                    stack[counter++]=c;
                    break;
//                    counter++;
                }
                case ')' -> {
                    if(counter==0 || stack[--counter] != '('){
                        return false;
                    }
                    break;
//                    if(stack.isEmpty() || stack.pop() != '('){
//                        return false;
//                    }
                   // counter--;
                }
                case ']' -> {
                    if(counter==0 || stack[--counter] != '['){
                        return false;
                    }
                    break;
//                    if(stack.isEmpty() || stack.pop() != '['){
//                        return false;
//                    }
//                    counter--;
                }
                case '}' -> {
                    if(counter==0 || stack[--counter] != '{'){
                        return false;
                    }
                    break;

//                    if(stack.isEmpty() || stack.pop() != '{'){
//                        return false;
//                    }
//                    counter--;
                }
                default -> throw new IllegalArgumentException("Input string must contain parentheses only");
            }
        }
        return counter == 0;
    }

    public static void main(String[] args) {
//        String s = "()[]{}";
        String s = "([)]";
        System.out.printf("is valid parentheses: %s: %s%n", s, new ValidParentheses().isValid(s));
    }
}
