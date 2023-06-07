public class Bt1 {
    public static void main(String[] args) {
        int dem = 0; // Biến đếm số lượng số nguyên tố đã tìm thấy
        int so = 2; // Số nguyên đầu tiên cần kiểm tra

        System.out.println("20 số nguyên tố đầu tiên là:");

        while (dem < 20) { // Tiếp tục vòng lặp cho đến khi tìm thấy 20 số nguyên tố
            boolean snt = true; // Giả sử ban đầu số là số nguyên tố

            if (so < 2) {
                snt = false; // Số nhỏ hơn 2 không phải số nguyên tố
            } else {
                for (int i = 2; i <= Math.sqrt(so); i++) {
                    if (so % i == 0) {
                        snt = false; // Nếu có số chia hết cho so khác 1 và chính nó, thì so không phải số nguyên tố
                        break; // Thoát vòng lặp
                    }
                }
            }

            if (snt) {
                System.out.print(so + " "); // In số nguyên tố ra màn hình
                dem++; // Tăng biến đếm lên 1
            }

            so++; // Tăng số nguyên hiện tại lên 1 để kiểm tra số tiếp theo
        }
    }
}
