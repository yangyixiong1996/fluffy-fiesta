package com.joker.easy;

import java.util.Arrays;
import java.util.Set;

/**
 * @author: yyx
 * @Title: LeedCode27
 * @ProjectName: Joker_LeetCode
 * @Description: 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * @date: 2021/10/15 9:48
 */
public class LeedCode27 {

    public static void main(String[] args) {

        int[] nums = new int[]{0,1,2,2,3,0,4,2};

        int length = new LeedCode27().removeElement(nums, 2);

        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }


    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int length = 0;
        for (int i = 0, j = 0; i < nums.length && j < nums.length; i++) {
            if (nums[i] == val && i != nums.length - 1) {
                j = j > i ? j : i;
                for (; j < nums.length; j++) {
                    if (nums[j] != val) {
                        nums[i] = nums[j] + nums[i];
                        nums[j] = nums[i] - nums[j];
                        nums[i] = nums[i] - nums[j];
                        break;
                    }
                }
            }
        }
        for (; length < nums.length; length++) {
            if (nums[length] == val) {
                break;
            }
        }
        return length;
    }
}
