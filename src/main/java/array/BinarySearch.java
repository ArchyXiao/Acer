package array;

/**
 * @author archy.shawn
 * @description
 * @since 2023/12/06 15:41
 **/
public class BinarySearch {

    /**
     * 二分查找（左闭右闭区间）
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchWithLeftCloseRightClose(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }

        return -1;
    }

    /**
     * 二分查找（左闭右开区间）
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchWithLeftCloseRightOpen(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }

        return -1;
    }
}