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

    d. Vì ta không nắm được giá trị các phần từ nằm ở đâu trong mảng nên nếu lấy 2 phần tử lớn nhất cộng lại thì khả năng phần dư sẽ rất lớn so với k, mà trong khi đó ta chỉ cần thõa mãn điều kiện với tối thiểu nhưng phải áp dụng cho toàn bộ mảng A và B nên tốt nhất là lấy lớn nhất của A cộng với nhỏ nhất của B theo nguyên tắc bù trừ 