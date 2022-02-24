//Tính tổng của 1 cột yêu cầu
package ss3_Array_MethodInJava.Bai_Tap;

import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[][] arr2d= {{2.3,4.2,6},
                           {3,4,5},
                           {4,4.5,5.5}};
        System.out.print("Mang 2d co san: \n"+
                "2.3 4.2 6\n"+
                "3   4   5\n"+
                "4   4.5 5.5\n");
        System.out.print("Nhap cot tinh tong: ");
        int col=input.nextInt();
        System.out.print("Tong cua cot"+col+"= "+sumCol(arr2d,col)+"\n");

//        Nhập mảng
        System.out.print("Nhap so hang cua ma tran: ");
        int row = input.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int column = input.nextInt();
        double[][] arr = new double[row][column];
        for (row = 0; row < arr.length; row++) {
            for (column = 0; column < arr[row].length; column++) {
                System.out.print("Nhap arr[" + row + "][" + column + "]: ");
                arr[row][column] = input.nextInt();
            }
        }

//        Xuất mảng
        System.out.print("Mang 2d: ");
        for (int i = 0; i < row; i++) {
            System.out.print("\n");
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.print("\nNhap cot muon tinh tong: ");

        int columnSum=input.nextInt();
        System.out.println("Tong cua cot"+column+"="+sumCol(arr,columnSum));
    }

    public static double sumCol(double[][] arr,int col){
        double sum=0;
        for(int row=0;row<arr.length;row++){
            sum+=arr[row][col];
        }
        return sum;
    }
}
