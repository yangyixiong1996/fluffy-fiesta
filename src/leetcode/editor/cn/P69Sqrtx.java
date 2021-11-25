//给你一个非负整数 x ，计算并返回 x 的 算术平方根 。 
//
// 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。 
//
// 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 4
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：x = 8
//输出：2
//解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= x <= 231 - 1 
// 
// Related Topics 数学 二分查找 
// 👍 825 👎 0


package leetcode.editor.cn;

//Java：Sqrt(x)
public class P69Sqrtx {
    public static void main(String[] args) {
        Solution solution = new P69Sqrtx().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int mySqrt(int x) {
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
//leetcode submit region end(Prohibit modification and deletion)

}
