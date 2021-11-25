package com.joker.easy;

/**
 * @author: yyx
 * @Title: LeedCode28
 * @ProjectName: Joker_LeetCode
 * @Description:实现 strStr() 函数。
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。
 * 如果不存在，则返回 -1
 * @date: 2021/10/16 9:23
 */
public class LeedCode28 {
    public static void main(String[] args) {

        System.out.println(new Solution().strStr("mississippi", "issip"));
    }

    static class Solution {
        // 已通过版本
//        public int strStr(String haystack, String needle) {
//            if (needle.length() == 0 || haystack.equals(needle)) {
//                return 0;
//            }
//            if (haystack.length() == 0) {
//                return -1;
//            }
//            for (int i = 0; i < haystack.length(); i++) {
//                if (haystack.charAt(i) == needle.charAt(0)) {
//                    if (haystack.length() - i >= needle.length()) {
//                        String copyStr = haystack.substring(i, i + needle.length());
//                        if (copyStr.equals(needle)) {
//                            return i;
//                        }
//                    }
//                }
//            }
//            return -1;
//        }

        public int strStr(String haystack, String needle) {
            if (needle.length() == 0 || haystack.equals(needle)) {
                return 0;
            }
            if (haystack.length() == 0) {
                return -1;
            }
            for (int i = 0, flag = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    if (haystack.length() - i >= needle.length()) {
                        for (int j = 0; j < needle.length(); j++) {
                            if (needle.charAt(j) != haystack.charAt(i + j)) {
                                break;
                            }
                            flag = j;
                        }
                    }
                    if (flag == needle.length() - 1) {
                        return i;
                    }
                }
            }
            return -1;
        }

    }

}
