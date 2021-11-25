//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 
//
// 请必须使用时间复杂度为 O(log n) 的算法。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,3,5,6], target = 5
//输出: 2
// 
//
// 示例 2: 
//
// 
//输入: nums = [1,3,5,6], target = 2
//输出: 1
// 
//
// 示例 3: 
//
// 
//输入: nums = [1,3,5,6], target = 7
//输出: 4
// 
//
// 示例 4: 
//
// 
//输入: nums = [1,3,5,6], target = 0
//输出: 0
// 
//
// 示例 5: 
//
// 
//输入: nums = [1], target = 0
//输出: 0
// 
//
// 
//
// 提示: 
//
// 
// 1 <= nums.length <= 104 
// -104 <= nums[i] <= 104 
// nums 为无重复元素的升序排列数组 
// -104 <= target <= 104 
// 
// Related Topics 数组 二分查找 
// 👍 1130 👎 0


package leetcode.editor.cn;

//Java：搜索插入位置
public class P35SearchInsertPosition {
    public static void main(String[] args) {
        Solution solution = new P35SearchInsertPosition().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int searchInsert(int[] nums, int target) {

            if (nums[nums.length - 1] < target || nums[0] > target) {
                return nums[0] > target ? 0 : nums.length;
            }
            int i = 0, j = nums.length - 1;
            while (j - i >= 0) {
                if (i == j) {
                    break;
                }
                if (nums[i] == target || nums[j] == target) {
                    return nums[i] == target ? i : j;
                }
                if (nums[(j + i) / 2] > target) {
                    j = (j + i) / 2;
                } else {
                    i = (j + i) / 2;
                }
                if (nums[i] < target && nums[j] > target&& j - i == 1) {
                    return i + 1;
                }

            }
            return i;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
