//Đảo ngược mảng
package ss3_Array_MethodInJava.thuc_hanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Input the element of array: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        }
//        nhập mảng
        while (size > 20);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = input.nextInt();
        }
//        xuất mảng
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

//        đảo ngược mảng
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int i:array) {
            System.out.print(i +"\t");

        }
    }
}

