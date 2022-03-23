package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class FindStringAscending {
    public static void main(String[] args) {
        Stack<Character> characterStack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao chuoi: ");
        String string = input.nextLine();
        char[] strings = string.toCharArray();

        for (char a : strings) {
            characterStack.add(a);
        }

        for (int i = 0; i < characterStack.size() - 1; i++) {
            if (strings[i + 1] < strings[i]) {
                characterStack.remove(i + 1);
            }
        }

        Collections.sort(characterStack);
        System.out.println(characterStack);
    }
}
