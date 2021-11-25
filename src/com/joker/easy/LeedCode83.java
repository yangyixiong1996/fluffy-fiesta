package com.joker.easy;

import leetcode.editor.cn.P83RemoveDuplicatesFromSortedList;

/**
 * @author: Yangyx
 * @Title: LeedCode83
 * @ProjectName: Joker_LeetCode
 * @Description:存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
 * @date: 2021/10/25 9:03
 */
public class LeedCode83 {
    public static void main(String[] args) {
        int[] vals = new int[]{1, 2, 3, 3};
        ListNode head = new ListNode(1);
        ListNode point = head;
        for (int i = 0; i < vals.length; i++) {
            ListNode node = new ListNode(vals[i]);
            point.next = node;
            point = point.next;
        }
        point = head = new LeedCode83().deleteDuplicates(head);

        while (point != null) {
            System.out.print(point.val + " ");
            point = point.next;
        }

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pointL = head, pointR = head;

        while (pointR.next != null) {
            if (pointL.val != pointR.val) {
                pointL.next = pointR;
                pointL = pointL.next;
            }
            pointR = pointR.next;
        }
        if (pointL.val != pointR.val) {
            pointL.next = pointR;
        } else {
            pointL.next = null;
        }

        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
