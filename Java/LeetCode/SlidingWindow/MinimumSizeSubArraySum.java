public class MinimumSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int total = 0;

        float res = Float.POSITIVE_INFINITY;
        for(int r = 0; r < nums.length; ++r){
            total += nums[r];
            while(total >= target){
                res = Math.min(res, r - l + 1);
                total -= nums[l];
                l += 1;
            }

        }
        return res == Float.POSITIVE_INFINITY ? 0 : (int)res;
    }
}