package java;
import java.util.Random;

public class FindMedian {
    public static int findMedian(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int targetIndex = arr.length / 2; // Vị trí của phần tử trung vị

        Random random = new Random();
        while (left <= right) {
            int pivotIndex = random.nextInt(right - left + 1) + left;
            int newPivotIndex = partition(arr, left, right, pivotIndex);

            if (newPivotIndex == targetIndex) {
                return arr[newPivotIndex];
            } else if (newPivotIndex < targetIndex) {
                left = newPivotIndex + 1;
            } else {
                right = newPivotIndex - 1;
            }
        }

        return -1; // Trường hợp không tìm thấy phần tử trung vị
    }

    private static int partition(int[] arr, int left, int right, int pivotIndex) {
        int pivotValue = arr[pivotIndex];
        swap(arr, pivotIndex, right); // Di chuyển phần tử pivot đến cuối mảng
        int storeIndex = left;

        for (int i = left; i < right; i++) {
            if (arr[i] < pivotValue) {
                swap(arr, i, storeIndex);
                storeIndex++;
            }
        }

        swap(arr, storeIndex, right); // Đặt phần tử pivot vào vị trí đúng

        return storeIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 7, 6, 3 }; // Mảng số nguyên ví dụ

        int median = findMedian(arr);

        System.out.println("Median: " + median);
    }
}
