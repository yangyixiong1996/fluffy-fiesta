package com.joker.easy;

/**
 * @author: Yangyx
 * @Title: LeedCode67
 * @ProjectName: Joker_LeetCode
 * @Description:二进制求和，给你两个二进制字符串，返回它们的和（用二进制表示）。输入为非空 字符串且只包含数字 1 和 0。
 * @date: 2021/11/16 13:40
 */
public class LeedCode67 {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(new LeedCode67().addBinary(a, b));
    }

    public String addBinary(String a, String b) {
        StringBuffer longStr = a.length() >= b.length() ? new StringBuffer(a) : new StringBuffer(b);
        String shortStr = a.length() >= b.length() ? b : a;
        int flag = 0, schr, lchr;
        for (int i = shortStr.length() - 1, j = longStr.length() - 1; j >= 0; i--, j--) {
            if (i < 0) {
                schr = 0;
            } else {
                schr = shortStr.charAt(i) - '0';
            }
            lchr = longStr.charAt(j) - '0';
            if (flag + schr + lchr == 0) {
                flag = 0;
                continue;
            }
            if (flag + schr + lchr == 1) {
                longStr.setCharAt(j, '1');
                flag = 0;
                continue;
            }
            if (flag + schr + lchr == 2) {
                longStr.setCharAt(j, '0');
                flag = 1;
                continue;
            }
            if (flag + schr + lchr == 3) {
                longStr.setCharAt(j, '1');
                flag = 1;
                continue;
            }
        }
        if (flag == 1) {
            longStr.insert(0, '1');
        }
        return longStr.toString();
    }
}
