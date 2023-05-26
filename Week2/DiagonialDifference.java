import java.util.List;
import java.lang.Math;

public class DiagonialDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {

            int leftRightDiag = 0;
            int rightToLeftDiag = 0;


            int n = arr.size();
            for(int i = 0; i < n; i++) {
                leftRightDiag += arr.get(i).get(i);
                rightToLeftDiag += arr.get(i).get(n - i -1);
            }

            return Math.abs(leftRightDiag - rightToLeftDiag);
        }
}