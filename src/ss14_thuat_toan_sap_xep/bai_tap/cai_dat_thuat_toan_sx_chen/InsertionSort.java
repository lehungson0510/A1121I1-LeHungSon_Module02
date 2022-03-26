package ss14_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sx_chen;

import java.util.Arrays;

public class InsertionSort {
    public static double[] list = {-1.0, -4.0, 6.5, 1.2, 9, 8.4, 3.2};

    public static void main(String[] args) {
        System.out.printf("%-20s", "List:     ");
        Arrays.stream(list).forEach(value -> System.out.printf("%10.1f", value));
        System.out.println();
        System.out.printf("%-20s", "List after sort: ");
        insertionSort(list);
        Arrays.stream(list).forEach(value -> System.out.printf("%10.1f", value));
    }

    public static void insertionSort(double[] list) {
        int pos;
        double x;
        for (int i = 1; i < list.length; i++) {
            pos = i;
            x = list[i];
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }
}



