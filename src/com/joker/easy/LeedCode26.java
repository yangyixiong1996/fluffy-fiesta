package com.joker.easy;

/**
 * @author: yyx
 * @Title: LeedCode26
 * @ProjectName: Joker_LeetCode
 * @Description: 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * @date: 2021/10/11 14:22
 */
public class LeedCode26 {
    public static void main(String[] args) {

        int[] nums = new int[]{1,1,2};

        int length = new LeedCode26().removeDuplicates(nums);

        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }

    public int removeDuplicates(int[] nums) {
        int length = 0;
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != nums[length]) {
                length++;
                nums[length] = nums[i];
            }
        }
        return length+1;
    }
}
