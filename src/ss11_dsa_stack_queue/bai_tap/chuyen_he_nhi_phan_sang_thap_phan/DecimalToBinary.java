package ss11_dsa_stack_queue.bai_tap.chuyen_he_nhi_phan_sang_thap_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số hệ thập phân: ");
        int numberDecimal = input.nextInt();
        Stack<Integer> stack = new Stack<>();

        System.out.print(numberDecimal + " sang nhị phân: ");
        while (!(numberDecimal == 0)) {
            stack.add(numberDecimal % 2);
            numberDecimal /= 2;
        }

        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }
}
