package com.sacevedo.questions;

import java.util.*;

/* Title: Two Sum
 * Description:
 * Given a list of integers (nums) and an integer target, return the indices
 * of two distinct numbers such that their sum is equal to target.
 *
 * Constraints:
 * - Exactly one valid solution exists.
 * - The same element cannot be used twice.
 * - You can return indices in any order.
 */

public class TwoSum {

    public static List<Integer> twoSum(List<Integer> nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums.get(i);
            if (seen.containsKey(complement)) {
                return List.of(seen.get(complement), i);
            }
            seen.put(nums.get(i), i);
        }
        return null;
    }


    static void main() {
        List<Integer> nums = List.of(1,3,7,9,2);
        IO.println(twoSum(nums, 11));
    }
}