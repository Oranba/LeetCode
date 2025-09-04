package oran.practice.algoritm.search;

public class BinarySearch2 {

    private static int binarySearch (int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + high >>> 1;

            if (arr[mid] == x) {
                return mid; // Element found
            }
            if (arr[mid] < x) {
                low = mid + 1; // Search in the right half
            }
            else if (arr[mid] > x) {
                high = mid - 1; // Search in the left half
            }
        }
        return -1; // Element not found
    }

    public static void main (String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        int x = 4;
        int result = binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present in array");
        }
        else {
            System.out.println("Element found at index " + result);
        }
    }
}
