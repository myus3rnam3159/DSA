package ArrayString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {
    private HashMap<Integer, Integer> map;
    private ArrayList<Integer> arr;

    public RandomizedSet() {
        map = new HashMap<>();
        arr = new ArrayList<>();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)) return false;

        arr.add(val);
        map.put(val, arr.size() - 1);

        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;

        int idx = (int) map.get(val);
        int lastVal =(int) arr.get(arr.size()  - 1);

        arr.set(idx, lastVal);
        arr.remove(arr.size() - 1);

        map.put(lastVal, idx);
        map.remove(val);

        return true;

    }

    public int getRandom() {
        return arr.get(new Random().nextInt(arr.size()));
    }
}
