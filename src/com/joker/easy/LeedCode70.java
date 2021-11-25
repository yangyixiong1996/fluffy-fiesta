package com.joker.easy;

/**
 * @author: Yangyx
 * @Title: LeedCode70
 * @ProjectName: Joker_LeetCode
 * @Description:
 * @date: 2021/11/16 15:00
 */
public class LeedCode70 {
    public static void main(String[] args) {
         System.out.println(new LeedCode70().climbStairs(3));
    }

    //递归方法
/*    public int climbStairs(int n) {
        if (n < 0)
            return -1;
        if (n <= 2)
            return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }*/

    // 迭代
    public int climbStairs(int n) {
        if (n < 0) return -1;
        if (n <= 2) return n;
        int temp1 = 1;
        int temp2 = 2;
        int res = 0;
        for (int i = 3; i <= n; i++) {
            res = temp1 + temp2;
            temp1 = temp2;
            temp2 = res;
        }
        return res;
    }

    //动态规划
/*    public static int climbStairs(int n) {
        if (n == 0) return -1;
        if (n == 1) return 1;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 0; i < n - 2; i++) {
            dp[i + 2] = dp[i] + dp[i + 1];
        }
        return dp[n - 1];
    }*/
}
