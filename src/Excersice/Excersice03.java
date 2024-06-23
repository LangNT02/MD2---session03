package Excersice;

import java.util.Scanner;

public class Excersice03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng 1: ");
        int sizeArray1 = scanner.nextInt();
        int[] Array1 = new int[sizeArray1];

        System.out.println("Nhập các phần tử của mảng 1: ");
        for (int i = 0; i < sizeArray1; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ": ");
            Array1[i] = scanner.nextInt();
        }

        System.out.println("Nhập kích thước của mảng 2:");
        int sizeArray2 = scanner.nextInt();
        int[] Array2 = new int[sizeArray2];

        System.out.println("Nhp các phần tử của mảng 2:");
        for (int i = 0; i < sizeArray2; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ": ");
            Array2[i] = scanner.nextInt();
        }

        int[] Array3 = new int[sizeArray1 + sizeArray2];

        for (int i = 0; i < sizeArray1; i++) {
            Array3[i] = Array1[i];
        }

        for (int i = 0; i < sizeArray2; i++) {
            Array3[i] = Array2[i];
        }

        System.out.println("Mảng sau khi gộp: ");
        for (int i = 0; i < Array3.length; i++) {
            System.out.println(Array3[i] + " ");
        }

    }
}
