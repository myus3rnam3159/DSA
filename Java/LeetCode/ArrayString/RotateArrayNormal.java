package ArrayString;

public class RotateArrayNormal {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];

        for(int i = 0; i < nums.length; ++i) {
            if(i + k <= nums.length - 1){
                temp[i + k] = nums[i];
            }
            else{
                temp[(i + k) % nums.length] = nums[i];
            }
        }

        for(int i = 0; i < nums.length; ++i){
            nums[i] = temp[i];
        }
    }
}
