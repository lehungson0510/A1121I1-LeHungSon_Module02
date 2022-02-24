//Tổng đường chéo chình của ma trận vuông
package ss3_Array_MethodInJava.Bai_Tap;

import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma tran vuong mxm: ");
        int m = input.nextInt();
        int[][] arr2d = new int[m][m];
        int total=0;

//        Nhập mảng
        for (int row = 0; row < arr2d.length; row++) {
            for (int column = 0; column < arr2d[row].length; column++) {
                System.out.print("Nhap arr[" + row + "][" + column + "]: ");
                arr2d[row][column] = input.nextInt();
            }
        }

        //        Xuất mảng và Tính tổng đường chéo chính của ma trận vuông
        System.out.print("Mang 2d: ");
        for (int row = 0; row < arr2d.length; row++) {
            System.out.print("\n");
            for (int column = 0; column < arr2d[row].length; column++) {
                if(row==column){
                    total+=arr2d[row][column];
                }
                System.out.print(arr2d[row][column] + " ");
            }
        }
        System.out.print("\nTong cua duong cheo chinh= "+total);
    }
}
