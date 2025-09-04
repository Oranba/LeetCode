package oran.practice.algoritm.search;

import static java.util.Arrays.binarySearch;

public class BinarySearch {

    private static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
//            int mid = left + (right - left) / 2; // Calculate mid index to avoid overflow
            int mid = (left + right) >>> 1 ;
            if (arr[mid] == x) {
                return mid; // Element found
            }
            if (arr[mid] < x) {
                left = mid + 1; // Search in the right half
            }
            else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int result = binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
