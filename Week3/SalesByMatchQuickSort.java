import java.util.Collections;
import java.util.List;

public class SalesByMatchQuickSort {

    public static void quickSort(List<Integer> arr, int low, int high){
        if(low < high){

            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);

            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(List<Integer> arr, int low, int high){

        int pivotValue = arr.get(high); // Chọn pivot là phần tử cuối cùng của mảng
        int i = low - 1; // Chỉ số của phần từ nhỏ hơn pivot

        for (int j = low; j < high; ++j){
            if(arr.get(j) < pivotValue ){

                ++i;
                if(i != j){
                    Collections.swap(arr, i, j);
                }
            }
        }
        Collections.swap(arr, i + 1, high);
        return i + 1;
    }

    public static int sockMerchant(int n, List<Integer> ar){
        quickSort(ar, 0, n - 1);

        int numOfPairs = 0;
        int color = ar.get(0);

        for(int i = 1; i < n; ++i){
            if(ar.get(i) == color){
        
                ++numOfPairs;
                color = ar.get(i + 1);
                
                ++i;
                continue;
            }
            color = ar.get(i);
        }

        return numOfPairs;
    }
}
