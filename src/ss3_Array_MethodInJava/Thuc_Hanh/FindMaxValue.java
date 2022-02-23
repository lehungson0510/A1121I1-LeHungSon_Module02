//Tìm giá trị lớn nhất
package ss3_Array_MethodInJava.Thuc_Hanh;

import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter the size: ");
            size=input.nextInt();
            if(size>20){
                System.out.println("Size should not exceed 20");
            }
        } while (size>20);

//        Nhap gia tri cho mang
        array=new int[size];
        for(int i=0; i<array.length;i++){
            System.out.print("Enter element "+i+1+": ");
            array[i]=input.nextInt();
        }

//        Xuat gia tri da nhap
        System.out.print("Property list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        int max=array[0];
        int index=1;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
                index=i;
            }
        }
        System.out.println("\nThe largest property value in the list is " + max + " ,at position " + index);
    }
}
