package ss14_thuat_toan_sap_xep.thuc_hanh.cai_dat_sx_chon;

import java.util.Arrays;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void main(String[] args) {
        selectionSort(list);
        Arrays.stream(list).forEach(value -> System.out.printf("%6.1f", value));
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {

            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
