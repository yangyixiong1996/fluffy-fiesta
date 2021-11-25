package com.joker.easy;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * <p>
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 * <p>
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeedCode9 {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        char[] nums = String.valueOf(x).toCharArray();

        for (int i = 0, j = nums.length - 1; i <= nums.length / 2 && j >= nums.length / 2; i++, j--) {
            if (nums[i] != nums[j])
                return false;
        }
        return true;
    }

    /**
     * 循环后面的数 减去前面的数
     *
     * @param x
     * @return
     */

    public boolean isPalindrome2(int x) {
        if (x < 0)
            return false;
        int rem = 0, y = 0;
        int quo = x;
        while (quo != 0) {
            rem = quo % 10;
            y = y * 10 + rem;
            quo = quo / 10;
        }
        return y == x;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
}
