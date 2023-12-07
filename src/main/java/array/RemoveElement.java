package array;

/**
 * @author archy.shawn
 * @description
 * @since 2023/12/07 00:11
 **/
public class RemoveElement {

    /**
     * 从数组中移除目标元素，并返回新数组的大小
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int fast = 0, slow = 0;
        for (; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}