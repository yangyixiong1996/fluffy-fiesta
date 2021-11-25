//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
// 
//
// 示例 2： 
//
// 
//输入：l1 = [], l2 = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 两个链表的节点数目范围是 [0, 50] 
// -100 <= Node.val <= 100 
// l1 和 l2 均按 非递减顺序 排列 
// 
// Related Topics 递归 链表 
// 👍 1962 👎 0


package leetcode.editor.cn;

import com.joker.easy.LeedCode21;

import java.util.HashMap;
import java.util.Map;

//Java：合并两个有序链表
public class P21MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution solution = new P21MergeTwoSortedLists().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

            if (l1 == null && l2 == null) {
                return null;
            }

            Map<Integer, Integer> getmap = new HashMap<>();

            while (l1 != null) {
                if (getmap.containsKey(l1.val)) {
                    getmap.put(l1.val, getmap.get(l1.val) + 1);
                } else {
                    getmap.put(l1.val, 1);
                }
                l1 = l1.next;
            }
            while (l2 != null) {
                if (getmap.containsKey(l2.val)) {
                    getmap.put(l2.val, getmap.get(l2.val) + 1);
                } else {
                    getmap.put(l2.val, 1);
                }
                l2 = l2.next;
            }

            ListNode returnList = new ListNode();
            ListNode head = returnList;

            for (Integer key : getmap.keySet()) {
                for (int i = 1; i <= getmap.get(key); i++) {
                    ListNode node = new ListNode();
                    node.val = key;
                    returnList.next = node;
                    returnList = returnList.next;
                }
            }
            return head.next;
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)
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
