package oran.practice.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    /**
     * Determines which kids have the greatest number of candies after distributing extra candies.
     *
     * @param candies an array representing the number of candies each kid has
     * @param extraCandies the number of extra candies to distribute
     * @return an array of booleans indicating which kids have the greatest number of candies
     */
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

//        boolean[] result = new boolean[candies.length];
//        for (int i = 0; i < candies.length; i++) {
//            result[i] = (candies[i] + extraCandies) >= maxCandies;
//        }
//        return result;
        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies){
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
//        boolean[] result = kidsWithCandies(candies, extraCandies);
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        for (boolean b : result) {
            System.out.print(b + " ");
        }
    }
}
