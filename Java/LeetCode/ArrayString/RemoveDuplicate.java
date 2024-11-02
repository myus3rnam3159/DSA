package ArrayString;

class RemoveDuplicatte {
    public int remoteDuplicate(int[] nums) {
        int k = 0;
        for (int i = k + 1; i < nums.length; ++i) {
            if(nums[i] != nums[k]) {
                k += 1;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
}