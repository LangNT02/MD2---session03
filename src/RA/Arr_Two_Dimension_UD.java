package RA;

import java.util.Scanner;

public class Arr_Two_Dimension_UD {
    public static void main(String[] args) {
        /*
         *1. Nhập số dòng và và số cột mảng 2 chiều số nguyên và khởi tạo mảng 2 chiêu
         *2. In menu và thực hiện các chức năng theo menu:
         *3. ***********MENU*************
         *   1. Nhập giá trị các phần tử
         *   2. In giá trị các phần tử theo ma trận
         *   3. In giá trị các phần tử nằm trên đường biên của ma trận
         *   4. Tính tổng các phần tử chia hết cho 3 trong mảng
         *   5. In ra các phần tử trên đường chéo chính và chéo phụ của mảng và tính tổng
         *   6. Sắp xếp các dòng giảm dần
         *   7. Thoát
         *   Lựa chọn của bạn:
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[size];

        do {
            System.out.println("*************MENU************");
            System.out.println(" 1. Nhập giá trị các phần tử");
            System.out.println("2. In giá trị các phần tử theo ma trận");
            System.out.println("3. In giá trị các phần tử nằm trên đường biên của ma trận");
            System.out.println("4. Tính tổng các phần tử chia hết cho 3 trong mảng");
            System.out.println("5. In ra các phần tử trên đường chéo chính và chéo phụ của mảng và tính tổng");
            System.out.println(" 6. Sắp xếp các dòng giảm dần");
            System.out.println("7. Thoát");
            System.out.println("Lựa chọn của bạn:");

        }

    }
}
