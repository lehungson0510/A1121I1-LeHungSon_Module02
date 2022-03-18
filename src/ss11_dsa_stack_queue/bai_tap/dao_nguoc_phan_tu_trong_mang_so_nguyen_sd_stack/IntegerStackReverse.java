package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_sd_stack;

import java.util.Scanner;
import java.util.Stack;

public class IntegerStackReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = input.nextInt();
        Stack<Integer> integers = new Stack<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + i + ": ");
            integers.push(input.nextInt());
        }

        System.out.print("Mang ban dau: ");
        for (int element : integers) {
            System.out.print(element + " ");
        }

        System.out.print("\nMang sau khi dao nguoc: ");
        while (!integers.empty()) {
            System.out.print(integers.pop()+" ");
        }
    }
}


