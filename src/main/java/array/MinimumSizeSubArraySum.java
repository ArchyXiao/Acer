package array;

/**
 * @author archy.shawn
 * @description
 * @since 2023/12/18 00:13
 **/
public class MinimumSizeSubArraySum {

    /**
     * 【长度最小的子数组】
     *
     * @param nums
     * @param target
     * @return
     */
    public int minSubArrayLen(int[] nums, int target) {
        int minSize = Integer.MAX_VALUE;
        int sum = 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                minSize = Math.min(minSize, j - i + 1);
                sum -= nums[i];
                i++;
            }
        }

        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }
}