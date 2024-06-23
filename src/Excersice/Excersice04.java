package Excersice;

import java.util.Scanner;

public class Excersice04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng của ma trận: ");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận: ");
        int col = scanner.nextInt();

        double [][] maTrix = new  double[row][col];

        System.out.println("Nhập các phần tử của ma trận: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Phần tử [" + i + "][" + j + "]: ");
                maTrix[i][j] = scanner.nextDouble();
            }
        }

       double max = maTrix[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (maTrix[i][j] > max) {
                    max = maTrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Ma trận đã nhập: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(maTrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Giá tr lớn nhất trong ma trận: " + max);
        System.out.println("Tọa độ của giá trị lớn nhất: [" + maxRow + "][" + maxCol + "]");

    }
}
