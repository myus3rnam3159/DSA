*** Phép XOR ***

Phép XOR (Exclusive OR) là một phép toán bitwise (bitwise operation) trong lập trình. Nó hoạt động trên các bit riêng lẻ của hai số và trả về một kết quả trong đó mỗi bit chỉ được đặt thành 1 nếu hai bit tương ứng khác nhau và 0 nếu hai bit tương ứng giống nhau

0 XOR 0 = 0
0 XOR 1 = 1
1 XOR 0 = 1
1 XOR 1 = 0

*** Vòng lặp phù hợp ***

    Vòng lặp for:
        Được sử dụng khi số lần lặp được biết trước.
        Có khả năng khai báo và cập nhật biến điều kiện trong cùng một dòng lệnh.
        Được biên dịch tốt và có hiệu suất cao hơn so với các loại vòng lặp khác.
        Thích hợp cho việc lặp qua một danh sách hoặc mảng với chỉ số.

    Vòng lặp while:
        Được sử dụng khi số lần lặp không được biết trước và phụ thuộc vào một điều kiện.
        Kiểm tra điều kiện trước khi thực hiện một lần lặp, có thể không bao giờ thực hiện lặp nếu điều kiện ban đầu sai.
        Thích hợp cho việc lặp khi không biết trước số lần lặp hoặc khi có điều kiện dừng phức tạp.

    Vòng lặp do-while:
        Giống với vòng lặp while, nhưng kiểm tra điều kiện sau mỗi lần lặp.
        Đảm bảo thực hiện ít nhất một lần lặp trước khi kiểm tra điều kiện.
        Thích hợp cho việc yêu cầu thực hiện ít nhất một lần lặp trước khi kiểm tra điều kiện dừng.

*** Phép dịch bit trái '<<' ***

L trong Java có nghĩa là long

Cụ thể, biểu thức (1L << 32) - 1 có nghĩa là:

    1. 1L là số 1 kiểu long (giả sử đang ở dạng 32 bit): 31 số 0 và 1 số 1: 0..001
    2. << 32: dịch số 1 sang trái 32 bit nên số một sẽ ở vị trí 33: 10...000
    3. phép trừ 1 thí sẽ đảo bit (0 thành 1, 1 thành 0) nên ta có: 01...111, nếu bỏ số 0 ở bên trái ngoài cùng ta được 32bit 1
    4. Đổi số cần chuyển ra hệ nhị phân 32 bit và XOR 32 bit 1 trên
    5. Chuyển số vừa cho về lại hệ 10.

*** Giải thích thuật toán count sort ***

* Điều kiện cần: phần tử mảng là số nguyên lớn hơn -1

    1. Lấy độ dài của mảng cần được sắp xếp.

    2. Tạo mảng đếm số lần xuất hiện của phần tử trong mảng cần sắp xếp (độ dài bằng giá trị lớn nhất của mảng sắp xếp + 1)
    
        a. Giá trị của phần từ trong mảng sắp xếp chính là chỉ số trên mảng đếm

* Chú ý: toán tử tăng tiền tố

    về mặt tối ưu, có một cách khác mà bạn có thể sử dụng để tăng giá trị của phần tử trong mảng lên một đơn vị, đó là sử dụng toán tử tăng tiền tố ++ thay vì toán tử hậu tố ++. Toán tử tăng tiền tố sẽ trả về giá trị mới của phần tử sau khi đã tăng, trong khi toán tử tăng hậu tố trả về giá trị ban đầu và thực hiện tăng giá trị sau đó.