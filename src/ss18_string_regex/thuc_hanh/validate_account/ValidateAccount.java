package ss18_string_regex.thuc_hanh.validate_account;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tài khoản: ");
        String account = input.nextLine();

        String pattern = "^[a-z0-9_]{6,}$";
        if(Pattern.matches(pattern,account)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
