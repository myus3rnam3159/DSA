package ArrayString;

public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        int fix = 1;
        for(int i = 0; i < nums.length; ++i) {
            ans[i] = fix;
            fix *= nums[i];
        }

        fix = 1;
        for(int i = nums.length - 1; i >= 0; --i) {
            ans[i] *= fix;
            fix *= nums[i];
        }

        return ans;
    }
}
