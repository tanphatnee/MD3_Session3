import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Loop
        //1. Vòng lặp for...i
//        for(int i = 0; i<10; i ++){
//            System.out.println("Giá trị của i là :" + i);
//        }
        // Voòng lặp while
//        int so = 0;
//        boolean check = true;
//        while (check){
//            System.out.println("Vòng lặp vẫn hoạt động !");
//            if (so >= 10){
//
//                check = false;
//            }
//            so++;
//        }
        Scanner sc = new Scanner(System.in);
//
//        // Do...while
//        int number = 0;
//        do{
//            System.out.println("Hãy nhạp vò một số tự nhiên");
//            number = Integer.parseInt(sc.nextLine());
//            System.out.println("Số m vừa nhập là " + number);
//        }while (number!=10);
        // Các mệnh đề Break/ Continue

        System.out.println("Hãy nhập vào 1 số bạ cần kiểm tra ");
        int snt = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        for (int i = 2; i < snt; i++) {
           if(snt % i == 0){
               flag = false;
               break;
           }
        }
        if(flag) {
            System.out.println("Số nguyên tố");
        } else {
            System.out.println("không phải số nguyên tố");
        }
    }
}