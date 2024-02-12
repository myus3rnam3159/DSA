package Java;
import java.util.*;

public class TheDeque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int maxUniques = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.addLast(num);
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            if (deque.size() > m) {
                int first = deque.pollFirst();
                countMap.put(first, countMap.get(first) - 1);
                if (countMap.get(first) == 0) {
                    countMap.remove(first);
                }
            }

            maxUniques = Math.max(maxUniques, countMap.size());
        }
        System.out.print(maxUniques);
        in.close();
    }
}
    
