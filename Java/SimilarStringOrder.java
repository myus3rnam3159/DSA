package Java;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class SimilarStringOrder {

    private static Map<Character, Integer> map = new HashMap<Character, Integer>();

    public static boolean isSimilarOrder(String x, String y) {

        String tempSource = "";
        for (Character c : y.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
                tempSource += c;
            }
        }

        String temp = "";
        for (Character c : x.toCharArray()) {

            if (map.get(c) == 0) {
                map.put(c, 1);
                temp += c;
            }
        }

        return temp.compareTo(tempSource) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();
        String y = scanner.nextLine();

        scanner.close();
        System.out.println(isSimilarOrder(x, y));
    }
}
