import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class SalesByMatchHashMap {
    public static int sockMerchant(int n, List<Integer> ar){
        
        Map<Integer, Integer> sockCounts = new HashMap<>();
        for(int color : ar){

            int count = sockCounts.getOrDefault(color, 0);
            sockCounts.put(color, count + 1);
        }
        int pairCount = 0;
        for(int count : sockCounts.values()){

            pairCount += count / 2;
        }
        return pairCount;
    }
}