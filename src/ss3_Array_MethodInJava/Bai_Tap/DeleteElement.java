//Xoá phần tử
package ss3_Array_MethodInJava.Bai_Tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("Nhap kich thuoc mang: ");
        size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu arr[" + i + "]: ");
            arr[i] = input.nextInt();
        }

        System.out.print("Mảng lúc đầu: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\nNhập số muốn xoá: ");
        int number = input.nextInt();

        for(int i=0;i<arr.length;i++) {
            if (arr[i] == number) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length-1]=0;
                i--;
            }
        }
        System.out.print("Mảng sau khi xoá: ");
        for (int i:arr){
            System.out.print(i+" ");
        }

    }
}


