import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class MaximumPerimeterTriangle{
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks){

        Collections.sort(sticks, Collections.reverseOrder());
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i  < sticks.size() - 2; ++i){
            if(sticks.get(i) < sticks.get(i + 1) + sticks.get(i + 2)){

                result.add(sticks.get(i + 2));
                result.add(sticks.get(i + 1));

                result.add(sticks.get(i));
                break;
            }
        }
        if(result.isEmpty()){
            result.add(-1);
        }
        return result;
    }
}