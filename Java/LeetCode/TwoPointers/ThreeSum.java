package TwoPointers;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length; ++i){
            int a = nums[i];

            if(i > 0 && a == nums[i-1]) continue;
            int l = i+1;
            int r = nums.length - 1;

            while(l < r){
                int threeSum = a + nums[l] + nums[r];

                if(threeSum > 0){--r;}
                else if (threeSum < 0){++l;}
                else{
                    result.add(Arrays.asList(a, nums[l], nums[r]));
                    ++l;
                    while (nums[l] == nums[l-1] && l < r) {
                        ++l;
                    }
                }
            }
        }

        return result;

    }
}
