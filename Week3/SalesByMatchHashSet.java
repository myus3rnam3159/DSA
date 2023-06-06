import java.util.HashSet;
import java.util.Set;

public class SalesByMatchHashSet {
    public static void main(String[] args) {
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int pairCount = countSockPairs(socks);
        System.out.println("Number of sock pairs: " + pairCount);
    }

    public static int countSockPairs(int[] socks) {
        Set<Integer> set = new HashSet<>();
        int pairCount = 0;

        for (int sock : socks) {
            if (set.contains(sock)) {
                set.remove(sock);
                pairCount++;
            } else {
                set.add(sock);
            }
        }

        return pairCount;
    }
}
