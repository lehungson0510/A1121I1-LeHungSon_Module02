//Tìm số nhỏ nhất trong mảng 2 chiều
package ss3_Array_MethodInJava.Bai_Tap;

import java.util.Scanner;

public class FindMinArr2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so hang cua ma tran: ");
        int row = input.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int col = input.nextInt();
        int[][] arr2d = new int[row][col];
        int min = arr2d[0][0];
        for (row = 0; row < arr2d.length; row++) {
            for (col = 0; col < arr2d[row].length; col++) {
                System.out.print("Nhap arr2d[" + row + "][" + col + "]: ");
                arr2d[row][col] = input.nextInt();
            }
        }
        System.out.print("Mang 2d: ");
        for (int i = 0; i < row; i++) {
            System.out.print("\n");
            for (int j = 0; j < col; j++) {
                if (arr2d[i][j] < min) {
                    min = arr2d[i][j];
                }
                System.out.print(arr2d[i][j] + " ");
            }
        }
        System.out.println("\nSo nho nhat mang 2d: " + min);
    }
}
