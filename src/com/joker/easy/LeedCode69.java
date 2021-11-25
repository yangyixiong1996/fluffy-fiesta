package com.joker.easy;

/**
 * @author: Yangyx
 * @Title: LeedCode69
 * @ProjectName: Joker_LeetCode
 * @Description:
 * @date: 2021/11/16 14:38
 */
public class LeedCode69 {
    public static void main(String[] args) {
        int x = 2147395600;
        System.out.println(new LeedCode69().mySqrt(x));
    }
    //暴力破解
//    public long mySqrt(int x) {
//        long num = 0;
//        while (num * num <= x) {
//            num++;
//        }
//        return Integer.valueOf((int) num) - 1;
//    }

    //二分法
    public long mySqrt(int x) {
        if (x == 1 || x == 0) {
            return x;
        }
        int min = 0, max = x;
        while (max - min > 1) {
            int m = (max + min) / 2;
            if (x / m < m)
                max = m;
            else
                min = m;
        }
        return min;
    }
}
