import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {

    // Euclidean algorithm
    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int result = 0;
        int lcmOfA = a.get(0);
        int gcdOfB = b.get(0);

        for (int number : a) {
            lcmOfA = lcm(lcmOfA, number);
        }

        for (int number : b) {
            gcdOfB = gcd(gcdOfB, number);
        }

        int multiple = lcmOfA;
        while (multiple <= gcdOfB) {
            if (gcdOfB % multiple == 0) {
                result++;
            }
            multiple += lcmOfA;
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(2);
        b.add(20);
        b.add(30);
        b.add(12);
        System.out.println(getTotalX(a, b));
    }
}
