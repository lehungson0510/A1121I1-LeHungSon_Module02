package ss18_string_regex.bai_tap.validate_lop_hoc;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateTenLopHoc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên lớp học : ");
        String nameClass = input.nextLine();
        String pattern = "^[CAP][0-9]{4}[G-M]$";
        if(Pattern.matches(pattern, nameClass)){
            System.out.println("Tên lớp hợp lệ: "+nameClass);
        } else {
            System.out.println("Tên lớp không hợp lệ: "+nameClass);
        }
    }
}
