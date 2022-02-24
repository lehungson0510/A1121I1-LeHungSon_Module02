//Gộp 2 mảng
package ss3_Array_MethodInJava.Bai_Tap;

import java.util.Scanner;
import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] arr1=new int[5];
        int[] arr2=new int[3];
        int[] arr3=new int[8];
        System.out.println("Nhap cac phan tu mang 1 ");
        for(int i=0;i<arr1.length;i++){
            System.out.print("nhap arr1["+i+"]: ");
            arr1[i]=input.nextInt();
        }
        System.out.println("Mang 1 :"+Arrays.toString(arr1));

        System.out.println("Nhap cac phan tu mang 2 ");
        for(int i=0;i<arr2.length;i++){
            System.out.print("nhap arr1["+i+"]: ");
            arr2[i]=input.nextInt();
        }
        System.out.println("Mang 2 :"+Arrays.toString(arr2));
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }
        System.out.println("Mang 3: "+Arrays.toString(arr3));
    }
}
