package com.joker.easy;

import java.util.Scanner;

/**
 * @author: yyx
 * @Title: LeedCode20
 * @ProjectName: Joker_LeetCode
 * @Description: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * @date: 2021/10/8 10:58
 */
public class LeedCode20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String printStr = in.next();

        LeedCode20 item = new LeedCode20();

        System.out.println(item.isValid(printStr));
    }

    public boolean isValid(String s) {
        if ('}' == (s.charAt(0)) || ']' == (s.charAt(0)) || ')' == (s.charAt(0))) {
            return false;
        }
        StringBuffer item = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if ('}' == s.charAt(i) || ']' == (s.charAt(i)) || ')' == (s.charAt(i))) {
                if (item.length() == 0) {
                    return false;
                }
                if (s.charAt(i) == '}' && item.charAt(item.length() - 1) == '{') {
                    item.deleteCharAt(item.length() - 1);
                } else if (s.charAt(i) == ']' && item.charAt(item.length() - 1) == '[') {
                    item.deleteCharAt(item.length() - 1);
                } else if (s.charAt(i) == ')' && item.charAt(item.length() - 1) == '(') {
                    item.deleteCharAt(item.length() - 1);
                } else {
                    return false;
                }
            } else {
                item.append(s.charAt(i));
            }
        }
        if (item.length() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
