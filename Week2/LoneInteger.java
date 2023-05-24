import java.util.List;

// Độ phức tạp O(n)
class LoneInteger{

    public static int lonelyInteger(List<Integer> array){

        //Sử dụng phép XOR

        //Chọn 0 vì 0 XOR x = x -> không ảnh hưởng tới giá trị phần tử trong mảng
        int result = 0;

        //Integer được chuyển tự động qua int thông qua unboxing
        for (int element : array){
            result ^= element;
        }

        return result;
    }
}