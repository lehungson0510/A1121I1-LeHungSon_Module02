package ss11_dsa_stack_queue.bai_tap.kiem_tra_chuoi_doi_xung_dung_queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Character> queue1 = new ArrayDeque<>();
        Queue<Character> queue2 = new ArrayDeque<>();
        System.out.print("Nhap vao chuoi muon kiem tra: ");
        String stringInput = input.nextLine();
        boolean flag = true;

        for (int i = 0; i < stringInput.length() / 2; i++) {
            queue1.add(stringInput.charAt(i));
        }

        for (int i = stringInput.length() - 1; i >= stringInput.length() / 2; i--) {
            queue2.add(stringInput.charAt(i));
        }

        while (!queue1.isEmpty()) {
            if (!(queue1.poll() == queue2.poll())) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println(stringInput + " is a Palindrome");
        } else System.out.println(stringInput + " is Not a Palindrome");
    }
}
