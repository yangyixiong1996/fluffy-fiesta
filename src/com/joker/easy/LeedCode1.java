package com.joker.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum/
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeedCode1 {

    /**
     * 暴力破解
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] returnAgrs = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    returnAgrs[0] = i;
                    returnAgrs[1] = j;
                    return returnAgrs;
                }
            }
        }
        return returnAgrs;
    }

    /**
     * 哈希表解法   空间换时间
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        int[] returnAgrs = new int[2];

        Map<Integer, Integer> numMap = new HashMap<>();

        numMap.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            if (numMap.containsKey(target - nums[i])) {
                returnAgrs[0] = i;
                returnAgrs[1] = numMap.get(target - nums[i]);
                return returnAgrs;
            } else {
                numMap.put(nums[i], i);
            }
        }
        return returnAgrs;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;

    }
}
