package com.joker.easy;

/**
 * @author: Yangyx
 * @Title: LeedCode35
 * @ProjectName: Joker_LeetCode
 * @Description:给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 请必须使用时间复杂度为 O(log n) 的算法
 * @date: 2021/10/19 8:42
 */
public class LeedCode35 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 4, 6, 7};

        System.out.println(new LeedCode35().searchInsert(nums, 3));
    }

    public int searchInsert(int[] nums, int target) {

        if (nums[nums.length - 1] < target || nums[0] > target) {
            return nums[0] > target ? 0 : nums.length;
        }
        int i = 0, j = nums.length - 1;
        while (j - i >= 0) {
            if (i == j) {
                break;
            }
            if (nums[i] == target || nums[j] == target) {
                return nums[i] == target ? i : j;
            }
            if (nums[(j + i) / 2] > target) {
                j = (j + i) / 2;
            } else {
                i = (j + i) / 2;
            }

            if (nums[i] < target && nums[j] > target && j - i == 1) {
                return i + 1;
            }

        }
        return i;
    }
}

