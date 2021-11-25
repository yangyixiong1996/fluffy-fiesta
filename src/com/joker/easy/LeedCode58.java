package com.joker.easy;

/**
 * @author: Yangyx
 * @Title: LeedCode58
 * @ProjectName: Joker_LeetCode
 * @Description:给你一个字符串s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中最后一个单词的长度。
 * @date: 2021/11/8 9:20
 */
public class LeedCode58 {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(new LeedCode58().lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");

        return str[str.length-1].length();
    }
}
