package ArrayString;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    int majorityElement(int[] nums) {
        int maxCount = 0;
        int result  = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int e: nums) {
            map.computeIfAbsent(e, v -> 1);
            map.computeIfPresent(e, (k, v) -> v + 1);

            if(maxCount < map.get(e)){
                result = e;
                maxCount = map.get(e);
            }
        }

        return result;
    }
}
