import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class PermutingTwoArrays{
    public static void heapSort(List<Integer> list){

        int n = list.size();
        //Xây dựng heap từ dãy ban đầu
        for(int i = n /2 -1; i>=0; --i){
            heapify(list, n, i);
        }
        //Đưa lần lượt phần tử lớn nhất vào cuối dãy và xây dựng lại Heap
        for(int i = n - 1; i > 0; --i){
            Collections.swap(list, 0, i);
            //Xây dựng lại Heap cho phần chưa được
            heapify(list, i, 0);
        }
    }

    public static void heapify(List<Integer> arr, int n, int i){

        int largest = i; // Khởi tạo phần tử lớn nhất là gốc Heap
        int left = 2 * i + 1; // Chỉ số nút con trái
        int right = 2 * i + 2; // Chỉ số nút con phải

        //So sánh phần tử gốc với nút con trái
        if(left < n && arr.get(left) > arr.get(largest)){
            largest = left;
        }

        //So sánh phần tử gốc với nút con phải
        if(right < n && arr.get(right) > arr.get(largest)){
            largest = right;
        }

        //nếu phần từ lớn nhất không phải gốc Heap
        if(largest != i){
            Collections.swap(arr, largest, i);
            heapify(arr, n, largest);
        }
    }

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        heapSort(A);
        Collections.sort(B, Comparator.reverseOrder());

        for(int i = 0; i < A.size(); ++i){
            if(A.get(i) + B.get(i) < k){
                return "NO";
            }
        }
        return "YES";
    }
}