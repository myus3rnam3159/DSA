*** Giải thích khái niệm ***

    Biến tĩnh (static variable): Biến tĩnh là một biến được chia sẻ bởi tất cả các đối tượng của một lớp. Nó được khai báo bên trong lớp và bên ngoài các phương thức. Một biến tĩnh chỉ tồn tại duy nhất một bản sao trong bộ nhớ và có thể truy cập thông qua tên lớp mà không cần tạo đối tượng của lớp đó.

    Phương thức tĩnh (static method): Phương thức tĩnh cũng thuộc về lớp và không thuộc về đối tượng cụ thể nào của lớp. Chúng có thể được gọi trực tiếp thông qua tên lớp mà không cần tạo đối tượng. Phương thức tĩnh chỉ có thể truy cập vào các biến tĩnh và các phương thức tĩnh khác trong cùng lớp.

    Khối tĩnh (static block): Khối tĩnh là một khối mã được đặt bên trong một lớp và được đánh dấu bằng từ khóa "static". Khối tĩnh được thực thi khi lớp được nạp và chỉ được thực thi một lần duy nhất. Đây là nơi để thực hiện các tác vụ khởi tạo hoặc cấu hình cho lớp.

Từ khóa "static" cho phép chúng ta truy cập và sử dụng các thành phần của lớp mà không cần tạo đối tượng, và nó cũng giúp tiết kiệm bộ nhớ và tăng hiệu suất trong một số trường hợp đặc biệt. Tuy nhiên, cần chú ý sử dụng static một cách thận trọng, vì việc sử dụng quá nhiều thành phần tĩnh có thể gây khó khăn trong việc quản lý và gây ra các vấn đề không mong muốn trong chương trình.