package oran.practice.bitwiseoperations;

/**
 * Bitwise operations in Java.
 *
 * This class provides an overview of bitwise operations such as AND, OR, XOR, NOT,
 * left shift, and right shift. These operations are performed on binary representations of integers.
 * * Bitwise operations are often used in low-level programming, cryptography, and performance optimization.
 * * Bitwise operations can be performed using operators like &, |, ^, ~, <<, and >>.
 * * Bitwise operations can be used to manipulate individual bits of integers, allowing for efficient data processing.
 * * Example operations include checking if a bit is set, toggling bits, and performing bit masks.
 * * Note: Bitwise operations are typically performed on integer types (int, long, etc.) in Java.
 * * Example usage:
 * * <pre>
 *     int a = 5; // 0101 in binary
 *     int b = 3; // 0011 in binary
 *     int andResult = a & b; // 0001 in binary (1 in decimal)
 *     int orResult = a | b; // 0111 in binary (7 in decimal)
 *     int xorResult = a ^ b; // 0110 in binary (6 in decimal)
 *     int notResult = ~a; // 1010 in binary (inverts bits, result depends on integer size)
 *     int leftShiftResult = a << 1; // 1010 in binary (10 in decimal)
 *     int rightShiftResult = a >> 1; // 0010 in binary (2 in decimal)
 *
 *     & (AND): Sets each bit to 1 if both bits are 1.
 *     | (OR): Sets each bit to 1 if at least one of the bits is 1.
 *     ^ (XOR): Sets each bit to 1 if only one of the bits is 1.
 *     ~ (NOT): Inverts all the bits.
 *     << (Left Shift): Shifts bits to the left, filling with zeros.
 *     >> (Signed Right Shift): Shifts bits to the right, preserving the sign bit.
 *     >>> (Unsigned Right Shift): Shifts bits to the right, filling with zeros.
 *
 *      Common uses:
 *          - Checking if a number is even/odd: n & 1
 *          - Swapping values without a temp variable: a ^= b; b ^= a; a ^= b;
 *          - Setting, clearing, toggling, or checking specific bits
 *          - Efficient multiplication/division by powers of two: n << k or n >> k
 *     * </pre>
 */
public class BitwiseOperations {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        // Bitwise AND
        int andResult = a & b; // 0001 in binary (1 in decimal)
        System.out.println("AND Result: " + andResult);

        // Bitwise OR
        int orResult = a | b; // 0111 in binary (7 in decimal)
        System.out.println("OR Result: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // 0110 in binary (6 in decimal)
        System.out.println("XOR Result: " + xorResult);

        // Bitwise NOT
        int notResult = ~a; // Inverts bits, result depends on integer size
        System.out.println("NOT Result: " + notResult);

        // Left Shift
        int leftShiftResult = a << 1; // 1010 in binary (10 in decimal)
        System.out.println("Left Shift Result: " + leftShiftResult);

        // Right Shift
        int rightShiftResult = a >> 1; // 0010 in binary (2 in decimal)
        System.out.println("Right Shift Result: " + rightShiftResult);
    }
}
