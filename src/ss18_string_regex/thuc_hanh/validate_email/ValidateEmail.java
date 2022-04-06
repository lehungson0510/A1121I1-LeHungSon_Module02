package ss18_string_regex.thuc_hanh.validate_email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập email: ");
        String email = input.nextLine();
        String patternEmail = "^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        if (Pattern.matches(patternEmail, email)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
