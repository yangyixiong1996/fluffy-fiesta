package com.joker.easy;

/**
 * @author: Yangyx
 * @Title: LeedCode66
 * @ProjectName: Joker_LeetCode
 * @Description:给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一,最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * @date: 2021/10/19 9:25
 */
public class LeedCode66 {
    public static void main(String[] args) {
        int[] nums = new int[]{9};
        nums = new LeedCode66().plusOne(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public int[] plusOne(int[] digits) {
        int target = 0;
        if (digits[digits.length - 1] + 1 == 10) {
            target = 1;
            digits[digits.length - 1] = 0;
        } else {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] + 1 == 10) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
        if (target == 1) {
            int[] retrunDigits = new int[digits.length + 1];
            retrunDigits[0] = 1;
            return retrunDigits;
        }
        return digits;
    }
}
