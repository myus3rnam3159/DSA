package ArrayString;

public class MajorityElementOptimized {
    public int majorityElement(int[] nums){
        int res = 0;
        int count = 0;

        for(int e: nums){
            if(count == 0){
                res = e;
            }
            count += e == res ? 1 : -1;
        }

        return res;
    }
}
