public class Bt2 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố bé hơn 100 là:");

        // Vòng lặp từ 2 đến 99 để kiểm tra các số
        for (int i = 2; i < 100; i++) {
            if (snt(i)) { // Kiểm tra xem i có phải là số nguyên tố hay không
                System.out.print(i + " "); // In ra số nguyên tố i
            }
        }
    }

    // Phương thức kiểm tra số nguyên tố
    public static boolean snt(int number) {
        boolean snt = true; // Giả sử ban đầu số là số nguyên tố

        if (number <= 1) {
            snt = false; // Số nhỏ hơn hoặc bằng 1 không phải số nguyên tố
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    snt = false; // Số chia hết cho i, không phải số nguyên tố
                    break; // Thoát vòng lặp
                }
            }
        }

        return snt; // Trả về true nếu số là số nguyên tố, ngược lại trả về false
    }
}
