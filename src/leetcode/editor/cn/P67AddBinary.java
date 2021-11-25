//给你两个二进制字符串，返回它们的和（用二进制表示）。 
//
// 输入为 非空 字符串且只包含数字 1 和 0。 
//
// 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
//
// 
//
// 提示： 
//
// 
// 每个字符串仅由字符 '0' 或 '1' 组成。 
// 1 <= a.length, b.length <= 10^4 
// 字符串如果不是 "0" ，就都不含前导零。 
// 
// Related Topics 位运算 数学 字符串 模拟 
// 👍 699 👎 0


package leetcode.editor.cn;

//Java：二进制求和
public class P67AddBinary {
    public static void main(String[] args) {
        Solution solution = new P67AddBinary().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
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
//leetcode submit region end(Prohibit modification and deletion)

}
