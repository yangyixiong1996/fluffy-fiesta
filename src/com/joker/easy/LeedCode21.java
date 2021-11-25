package com.joker.easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author: yyx
 * @Title: LeedCode21
 * @ProjectName: Joker_LeetCode
 * @Description: 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * @date: 2021/10/14 9:02
 */
public class LeedCode21 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.val = 1;

        ListNode l2 = new ListNode();
        l2.val = 1;
        int[] num1 = new int[]{1, 2, 4};
        int[] num2 = new int[]{1, 3, 4,-9};

        ListNode head1 = l1;
        ListNode head2 = l2;

        for (int i = 1; i < num1.length; i++) {
            ListNode node = new ListNode();
            node.val = num1[i];
            l1.next = node;
            l1 = l1.next;
        }

        for (int i = 1; i < num2.length; i++) {
            ListNode node = new ListNode();
            node.val = num2[i];
            l2.next = node;
            l2 = l2.next;
        }

        l1 = head1;
        l2 = head2;

        ListNode result = new LeedCode21().mergeTwoLists(l1, l2);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        Map<Integer, Integer> getmap = new TreeMap<>();

        while (l1 != null) {
            if (getmap.containsKey(l1.val+100)) {
                getmap.put(l1.val+100, getmap.get(l1.val+100) + 1);
            } else {
                getmap.put(l1.val+100, 1);
            }
            l1 = l1.next;
        }
        while (l2 != null) {
            if (getmap.containsKey(l2.val+100)) {
                getmap.put(l2.val+100, getmap.get(l2.val+100) + 1);
            } else {
                getmap.put(l2.val+100, 1);
            }
            l2 = l2.next;
        }

        ListNode returnList = new ListNode();
        ListNode head = returnList;

        for (Integer key : getmap.keySet()) {
            for (int i = 1; i <= getmap.get(key); i++) {
                ListNode node = new ListNode();
                node.val = key-100;
                returnList.next = node;
                returnList = returnList.next;
            }
        }


        return head.next;
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
