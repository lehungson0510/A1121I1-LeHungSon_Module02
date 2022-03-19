package ss11_dsa_stack_queue.bai_tap.kiem_tra_dau_ngoac;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập biểu thức: ");
        String expression = input.nextLine();
        char[] arr = expression.toCharArray();
        Stack<Character> stack = new Stack<>();
        Stack<Character> stackReverse = new Stack<>();
        boolean flag = true;

        for (char c : arr) {
            stack.push(c);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            stackReverse.push(arr[i]);
        }

        if (!(stack).isEmpty()) {
            if (stack.pop() == '(') {
                flag = false;
            }
        }

        if (!(stackReverse).isEmpty()) {
            if (stackReverse.pop() == ')') {
                flag = false;
            }
        }

        if (flag) {
            int bracketsLeft = 0;
            int bracketsRight = 0;
            while (!stack.isEmpty()) {
                if (stack.pop() == '(') {
                    bracketsLeft += 1;
                }
            }

            while (!stackReverse.isEmpty()) {
                if (stackReverse.pop() == ')') {
                    bracketsRight += 1;
                }
            }

            boolean check = bracketsLeft == bracketsRight;
            if (check) {
                System.out.println("Đúng");
            }else {
                System.out.println("Sai");
            }
        } else {
            System.out.println("Sai");
        }
    }
}
