package com.joker.easy;

import java.math.BigDecimal;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeedCode7 {
    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        long res = 0;//注意这里要使用long类型，
        // 不然即使反转后的数超出来范围，int类型也无法接收
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        // &&的话一定要判断两个条件都成立，||当一个条件成立时就执行，效率更高
        if (Math.pow(-2, 31) > res || res > (Math.pow(2, 31) - 1)) {
            return 0;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
