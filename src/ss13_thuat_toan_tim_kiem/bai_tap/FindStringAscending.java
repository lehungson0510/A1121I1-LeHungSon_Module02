package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.*;

public class FindStringAscending {
    public static void main(String[] args) {
        Stack<Character> characterStack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Input String: ");
        String string = input.nextLine();
        char[] chars = string.toCharArray();

        for (char a : chars) {
            characterStack.push(a);
        }

        for (int i = 0; i < characterStack.size() - 1; i++) {
            if (characterStack.get(i + 1) <= characterStack.get(i)) {
                characterStack.remove(i + 1);
                i--;
            }
        }

        Collections.sort(characterStack);
        for (Character a : characterStack) {
            System.out.print(a);
        }
    }
}
