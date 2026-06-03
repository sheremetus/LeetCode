package TwoSum;

import java.util.HashMap;


/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */

public class Main {

    public static void main(String[] args) {

        int[] testArray = {3, 2, 3};
        int target = 6;

        int[] result = twoSum(testArray, target);
        System.out.println(result[0] + " " + result[1]);
    }


    public static int[] twoSum(int[] nums, int target) {

        int point;
        for (int i = 0; i <= nums.length - 1; i++) {
            point = i + 1;
            for (int k = point; k <= nums.length - 1; k++) {

                if (nums[i] + nums[k] == target) {
                    return new int[]{i, k};
                }
            }

        }

        return null;
    }


    public int[] twoSumBest(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

}
