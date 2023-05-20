*** Câu hỏi ***

Cho mảng n (số lể) các số nguyên. Tìm số ở giữa (sau khi đã sắp xêp theo thứ tự từ nhỏ đến lớn)

*** Chú ý ***

Dưới đây là mô tả chi tiết về thuật toán QuickSelect:

    Chọn một phần tử ngẫu nhiên từ mảng gọi là pivot.

    Phân hoạch mảng thành hai phần, một phần có các phần tử nhỏ hơn hoặc bằng pivot và phần còn lại có các phần tử lớn hơn pivot. 

    Đảm bảo các phần tử trong phần nhỏ hơn pivot nằm bên trái pivot và các phần tử trong phần lớn hơn pivot nằm bên phải pivot. 
    Đồng thời, pivot sẽ được đặt vào vị trí chính xác mà nó sẽ nằm trong mảng đã sắp xếp.

    So sánh vị trí pivot (pivotIndex) với vị trí thứ k. Nếu pivotIndex = k, tức là ta đã tìm thấy giá trị trung vị, ta trả về pivot. 
    
    Nếu k < pivotIndex, ta tiếp tục tìm kiếm phần tử thứ k trong phần mảng nhỏ hơn pivot bằng cách đệ quy gọi lại thuật toán trên phần này. 
    
    Nếu k > pivotIndex, ta tiếp tục tìm kiếm phần tử thứ k trong phần mảng lớn hơn pivot bằng cách đệ quy gọi lại thuật toán trên phần này.

    Lặp lại các bước trên cho đến khi ta tìm thấy phần tử thứ k hoặc khi mảng đã được phân hoạch thành các phần mảng chỉ chứa một phần tử (left = right).

* Chọn pivot

Đưa pivot về cuối mảng trong hàm randomPartition là một cách thông thường để thực hiện phân hoạch trong thuật toán QuickSelect. Có một số lý do để chọn pivot là phần tử cuối cùng trong mảng:

    Đơn giản và dễ hiểu: Việc chọn pivot là phần tử cuối cùng trong mảng là đơn giản và dễ hiểu. Điều này giúp giảm độ phức tạp của việc chọn pivot.

    Hiệu suất tốt trong trường hợp trung bình: Trong trường hợp trung bình, việc chọn pivot là phần tử ngẫu nhiên từ mảng là một cách hiệu quả để đảm bảo hiệu suất tốt của thuật toán QuickSelect. Đưa pivot về cuối mảng đảm bảo rằng pivot sẽ không bị hoán đổi trong quá trình phân hoạch và có khả năng tạo ra các phân hoạch cân đối.

    Đảm bảo hiệu suất tốt trong trường hợp xấu nhất: Đưa pivot về cuối mảng giúp đảm bảo rằng thuật toán hoạt động tốt trong trường hợp xấu nhất khi mảng đã được sắp xếp hoặc gần sắp xếp. Khi pivot nằm ở cuối mảng, việc chọn pivot ngẫu nhiên sẽ giảm khả năng rơi vào trường hợp xấu nhất.