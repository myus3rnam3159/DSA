package ArrayString;

public class JumpGame {
    boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for(int i = goal - 1; i >= 0; --i){
            if(i + nums[i] >= goal) goal = i;
        }

        return goal == 0;
    }
}
