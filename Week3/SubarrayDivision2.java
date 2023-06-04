import java.util.List;

class SubarrayDivision2 {
    public static int birthday(List<Integer> s, int d, int m) {

        int waysOfDeviding = 0;
        int sum = 0;

        for (int i = 0; i < m && m <= s.size(); i++) {
            sum += s.get(i);
        }

        if (sum == d) {
            waysOfDeviding += 1;
        }

        for (int i = m; i < s.size(); i++) {
            sum += s.get(i) - s.get(i - m);
            if (sum == d) {
                waysOfDeviding += 1;
            }
        }

        return waysOfDeviding;
    }
}