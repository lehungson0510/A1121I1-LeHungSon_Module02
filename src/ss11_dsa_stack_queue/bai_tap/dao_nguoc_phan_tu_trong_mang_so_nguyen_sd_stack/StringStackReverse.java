package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_sd_stack;

import java.util.Scanner;
import java.util.Stack;

public class StringStackReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        Stack<String> stringArr = new Stack<>();
        String string = input.nextLine();
        String[] stringArray = string.split("");
        for (int i = 0; i < stringArray.length; i++) {
            stringArr.push(stringArray[i]);
        }

        System.out.print("Chuoi sau khi dao nguoc: ");
        while (!stringArr.empty()) {
            System.out.print(stringArr.pop());
        }
    }
}
