package ArrayString;

public class RainWaterTrap{
    public int trap(int[] height) {
        int water = 0;
        int l = 0; int r = height.length - 1;

        int maxL = height[l];
        int maxR = height[r];

        while(l < r){
            if(maxL < maxR) {
                ++l;
                maxL = Math.max(maxL, height[l]);
                water += (maxL - height[l]);
            }
            else{
                --r;
                maxR = Math.max(maxR, height[r]);
                water += (maxR - height[r]);
            }
        }

        return water;
    }
}