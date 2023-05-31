import java.util.List;
import java.lang.Math;

class FlippingTheMatrix{
    public static int flippingMatrix(List<List<Integer>> matrix){

        int n = matrix.size();
        int sum = 0;

        for (int i = 0; i < n/2; ++i){
            for(int j = 0; j < n/2; ++j){

                int max1 = Math.max(
                    matrix.get(i).get(j),
                    matrix.get(i).get(n - j - 1)
                    );
                
                int max2 = Math.max(
                    matrix.get(n - i - 1).get(n - j - 1),
                    matrix.get(n - i - 1).get(j)
                );

                sum += Math.max(max1, max2);

            }
        }
        return sum;
    }
}