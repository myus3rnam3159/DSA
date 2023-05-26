import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class CountingSort1 {
    public static List<Integer> countingSort(List<Integer> arr){

        int length = 101;
        List<Integer> occurences = new ArrayList<>(Collections.nCopies(length, 0)); // Mặc định toàn 0

        for(int num: arr){
            occurences.set(num, occurences.get(num) + 1);
        }

        occurences.remove(length - 1);
        return occurences;
    }
}