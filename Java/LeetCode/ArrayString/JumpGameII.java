package ArrayString;

public class JumpGameII {
    public int jump(int[] nums) {
        int minSteps = 0;
        int l = 0; int r = 0;

        for(int i = 0; i < nums.length; ++i) {
            if (i > l) {
                minSteps += 1;
                l = r;
            }
            if(r < nums[i] + i) {
                r = i + nums[i];
            }
        }

        return minSteps;
    }
}
