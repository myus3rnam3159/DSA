import java.util.List;
import java.util.HashMap;
import java.util.Map;

class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {

        Map<Integer, Integer> frequencies = new HashMap<>();
        int maxFrequency = 0;
        int birdId = 0;

        for (int birdType : arr) {
            int count = frequencies.getOrDefault(birdType, 0) + 1;
            frequencies.put(birdType, count);

            if (count > maxFrequency || (count == maxFrequency && birdType < birdId)) {
                maxFrequency = count;
                birdId = birdType;
            }
        }

        return birdId;
    }
}