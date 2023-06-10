import java.util.Arrays;

public class ZigZagSequence {
    public static void swap(int[] array, int index1, int index2){

        int temp = array[index1];
        array[index1] = array[index2];

        array[index2] = temp;
    }
    public static void findZigZagSequence(int[] a, int n){
        Arrays.sort(a);

        int mid = (n + 1) / 2;
        swap(a, mid - 1, (mid - 1) * 2);

        if((mid - 1) * 2 < n - 1){
            swap(a, (mid - 1) * 2 , n - 1);
        }
        for(int i = mid; i < n - 2; ++i){  
            swap(a, i, (n-1) - i - 1 + mid);
        }
    }
}
