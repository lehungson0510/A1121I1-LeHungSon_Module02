package ss3_Array_MethodInJava.Thuc_Hanh;

import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] array={10,4,5,5,7,9,21,21,11};
        System.out.print("array: ");
        for(int i:array){
            System.out.print(i+" ");
        }

        System.out.println("\ngia tri nho nhat la: "+findMin(array));

    }
    public static int findMin(int[] arr){
        int min=arr[0];
        for (int i:arr) {
            if (i < min) {
                min=i;
            }
        }
      return min;
    }
}
