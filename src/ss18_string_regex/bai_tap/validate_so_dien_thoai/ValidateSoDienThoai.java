package ss18_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateSoDienThoai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số điện thoại: ");
        String numberPhone = input.nextLine();
        String pattern = "^\\([\\d]{2}\\)-\\([\\d]{10}\\)";
        if(Pattern.matches(pattern,numberPhone)){
            System.out.println("Số điện thoại đúng: "+numberPhone);
        } else {
            System.out.println("Số điện thoại sai: "+numberPhone);
        }
    }
}
