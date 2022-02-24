//Thêm phần tử vào mảng
package ss3_Array_MethodInJava.Bai_Tap;

import java.util.Scanner;
import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        int size = input.nextInt();
        int index;
        int[] arr = new int[size+1];
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print("Nhap phan tu arr[" + i + "]: ");
            arr[i] = input.nextInt();
        }
        System.out.print("Mang ban dau: ");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.print("\nNhap so muon chen vao mang: ");
        int addNum=input.nextInt();
        do {
            System.out.print("Nhap vi tri muon chen: ");
            index = input.nextInt();
            if(index<=1||index>=arr.length-1) {
                System.out.printf("/nindex > 1 va index < %d", size);
            }
        } while (index<=1||index>=arr.length-1);


        for(int i=arr.length-1;i>=index;i--){
            arr[i]=arr[i-1];

        }

        arr[index]=addNum;
        System.out.print("Mang sau khi chen: "+Arrays.toString(arr));
    }
}
