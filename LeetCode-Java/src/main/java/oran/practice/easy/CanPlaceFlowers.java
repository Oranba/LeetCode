package oran.practice.easy;

public class CanPlaceFlowers {
    /**
     * Determines if flowers can be planted in a flowerbed without violating the no-adjacent-flowers
     * rule.
     *
     * @param flowerbed
     *        an array representing the flowerbed, where 0 is an empty plot and 1 is a planted flower
     * @param n
     *        the number of flowers to plant
     * @return true if n flowers can be planted without violating the rule, false otherwise
     */

    boolean canPlaceFlowers (int[] flowerbed, int n) {
        if(n==0) {
            return true; // If no flowers to plant, return true
        }
        if (flowerbed == null || flowerbed.length == 0) {
            return n <= 0; // If flowerbed is empty, we can only plant if n is 0
        }
        else if (flowerbed.length == 1) {
            return flowerbed[0] == 0 && n <= 1; // If flowerbed has one plot, we can plant if it's empty and n is 1 or less
        }
        else if (n > flowerbed.length) {
            return false; // If n is greater than the length of the flowerbed, we cannot plant
        }
        else {
            int count = 0; // Count of flowers planted
            for (int i = 0; i < flowerbed.length; i++) {
                if (flowerbed[i] == 0) { // Check if the current plot is empty
                    // Check if the previous and next plots are also
                    boolean prevEmpty = (i == 0 || flowerbed[i - 1] == 0);
                    boolean nextEmpty = ((i < flowerbed.length - 1 && flowerbed[i + 1] == 0) || (i == flowerbed.length - 1 && flowerbed[i] == 0));
                    if (prevEmpty && nextEmpty) {
                        count++; // Plant a flower here
                        flowerbed[i] = 1; // Mark this plot as planted
                        if(count >= n) {
                            return true; // If we have planted enough flowers, return true
                        }
                    }
                }
                else{
                    // If the current plot is not empty, we cannot plant a flower here
                    // We can skip to the next plot
                    i++; // Skip the next plot since we cannot plant adjacent flowers
                }
            }

        }
        return false;
    }

    public static void main (String[] args) {
        CanPlaceFlowers cpf = new CanPlaceFlowers();
        int[] flowerbed = {1, 0, 0, 0, 1,0,0};
        int n = 2;
        boolean result = cpf.canPlaceFlowers(flowerbed, n);
        System.out.println(result); // Output: true
    }
}
