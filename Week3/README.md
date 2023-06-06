*** Thuật toán HeapSort ***

Trong thuật toán Heap Sort, "heap" là một cấu trúc dữ liệu được sử dụng để sắp xếp các phần tử trong mảng. Heap là một loại cây nhị phân đầy đủ, trong đó giá trị của mỗi nút cha luôn lớn hơn hoặc bằng giá trị của các nút con của nó.

Một heap được sử dụng trong thuật toán Heap Sort thường được biểu diễn dưới dạng một mảng. Với một mảng có n phần tử, nút cha tại vị trí i sẽ có hai nút con tại vị trí 2i và 2i+1 trong mảng. Nhờ tính chất của heap, phần tử lớn nhất (hoặc nhỏ nhất, tùy thuộc vào loại heap) luôn nằm ở đỉnh cây, tức là ở phần tử đầu tiên của mảng.

Thuật toán Heap Sort sử dụng heap để xây dựng một cây nhị phân có thứ tự. Ban đầu, mảng được biến đổi thành một heap. Sau đó, phần tử lớn nhất (đối với heap tăng dần) được lấy ra khỏi heap và được đặt vào cuối mảng đã sắp xếp. Tiếp theo, cây heap được cập nhật lại và phần tử lớn nhất tiếp theo được lấy ra và đặt vào vị trí tiếp theo của mảng đã sắp xếp. Quá trình này được lặp lại cho đến khi toàn bộ mảng được sắp xếp.

*** Thuật toán permutting two arrays ***

* Sử dụng phương pháp tiếp cận bài toàn tham lam

    a. Tối ưu giá trị ở mỗi buớc chạy của bài toán, hy vọng điều đó sẽ cho ra giá trị tối ưu sau khi thuật toán dừng

* Vì yêu cầu bài toán là tìm ra hoán vị của 2 mảng cùng chiều dài A và B sao cho A[i] + B[i] >=k với i = 0...n-1

* Xét các trường hợp

    a. A[i] hoặc B[i] đã >= k rồi mà yêu cầu phần tử trong hai mảng không âm nên đây là trường hợp tốt nhất

    b. A[i] hoặc B[i] quá nhỏ nên tổng của chúng vẫn < k trường hợp xấu nhất.
    
    c. A[i] hoặc B[i] là thành phần tạo nên tổng >= k nên sẽ có chênh lệnh A[i] >= B[i] hoặc ngược lại để bù trừ cho nhau thõa mãn điều kiện (trườ)

    d. Vì ta không nắm được giá trị các phần từ nằm ở đâu trong mảng nên nếu lấy 2 phần tử lớn nhất cộng lại thì khả năng phần dư sẽ rất lớn so với k, mà trong khi đó ta chỉ cần thõa mãn điều kiện với tối thiểu nhưng phải áp dụng cho toàn bộ mảng A và B nên tốt nhất là lấy lớn nhất của A cộng với nhỏ nhất của B theo nguyên tắc bù trừ.

*** Giải thích thuật toán Subarray Division ***

* Cho mảng số nguyên n

* Tính số lần có thể bốc ra bộ liên tiếp m các số sao cho tổng của chúng bằng d

* Chạy từ chỉ số 0 đến m - 1: Tính tổng các số nguyên trong dãy và kiểm tra
* Từ chỉ số m đến n - 1: Lấy tổng đã tính bớt đi số nguyên cộng vào tổng ở đầu tiên, thay vào đó bằng số có chỉ số m -> kiểm tra
* Tiếp tục dịch lên từng ô một trong mảng như vậy và kiểm tra. 

*** Giải thich thuật toán Xor String ***

Cú pháp của toán tử điều kiện là condition ? expression1 : expression2. Nó hoạt động như sau: nếu condition đúng (true), giá trị của toán tử sẽ là expression1, ngược lại, nếu condition sai (false), giá trị của toán tử sẽ là expression2.

*** Thuật toán Quick sort ***

Giải thích và mô tả: https://www.geeksforgeeks.org/quick-sort/

* Chú ý: tại sao 'i + 1' : bởi hàm swap đã thay đổi thứ tự của giá trị nhưng biến i vẫn đang vị trí cũ nên phải + 1 mới ra vị trí mới đã được swap trước đó.
* i + 1 sẽ không bao h chạm đến high.

*** Thuật toán đếm cặp tất ***

* Sử dụng HashMap trong lập trình đơn luồng
* Sử dụng HashTable trong lập trình đa luồng

    Đồng bộ hóa: Hashtable là một lớp đồng bộ, có nghĩa là nó đảm bảo tính nhất quán và an toàn trong các môi trường đa luồng (multi-threaded). Các phương thức của Hashtable được đồng bộ hóa, vì vậy nhiều luồng có thể truy cập và sửa đổi Hashtable một cách an toàn. Trong khi đó, HashMap không đồng bộ hóa, nghĩa là nó không đảm bảo an toàn khi sử dụng trong các môi trường đa luồng. Nếu bạn cần sử dụng một từ điển trong một môi trường đa luồng, Hashtable là một lựa chọn tốt hơn.

    Thứ tự: Hashtable đảm bảo thứ tự của các cặp key-value. Khi bạn lặp lại qua các phần tử của Hashtable, bạn sẽ nhận được các phần tử theo thứ tự chúng được thêm vào. Ngược lại, HashMap không đảm bảo thứ tự của các cặp key-value. Khi bạn lặp lại qua các phần tử của HashMap, thứ tự có thể thay đổi theo cách không xác định.

    Cho phép giá trị null: HashMap cho phép sử dụng key và value null. Bạn có thể thêm một cặp key-value với key hoặc value là null. Trong khi đó, Hashtable không cho phép sử dụng giá trị null. Nếu bạn thử thêm một key hoặc value null vào Hashtable, nó sẽ ném ra ngoại lệ NullPointerException.

    Hiệu suất: Về mặt hiệu suất, HashMap thường nhanh hơn Hashtable. Hashtable có một overhead nhỏ hơn do đồng bộ hóa, trong khi HashMap không có overhead này. Trong hầu hết các tình huống, HashMap có hiệu suất tốt hơn Hashtable.