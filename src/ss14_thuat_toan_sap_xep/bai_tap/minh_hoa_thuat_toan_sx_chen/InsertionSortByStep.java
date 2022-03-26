package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sx_chen;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the size: ");
        int size = input.nextInt();
        double[] list = new double[size];
        System.out.println("Input "+list.length +" values: ");
        for ( int i = 0; i < list.length; i++){
            System.out.print("Input values list["+ i +"]: ");
            list[i] = input.nextDouble();
        }

        System.out.print("Your input list: ");
        for (double value : list) {
            System.out.print(value + " ");
        }

        System.out.println("\nBegin sort processing...");
        insertionSort(list);


    }
    public static void insertionSort(double[] array) {
        double x;
        int pos;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                // đổi chỗ
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;

            System.out.print("List after the  " + i + "' sort: ");
            for (double value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}
