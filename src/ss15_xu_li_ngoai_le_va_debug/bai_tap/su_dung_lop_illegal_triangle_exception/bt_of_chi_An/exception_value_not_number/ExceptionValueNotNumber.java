/*Viết chương trình nhập vào 2 số thực. Bắt ngoại lệ để khi nhập vào không phải là số.*/

package ss15_xu_li_ngoai_le_va_debug.bai_tap.su_dung_lop_illegal_triangle_exception.bt_of_chi_An.exception_value_not_number;

import ss15_xu_li_ngoai_le_va_debug.bai_tap.su_dung_lop_illegal_triangle_exception.UserException;

import java.util.Scanner;

public class ExceptionValueNotNumber {
    public static void main(String[] args) {
        try {
            System.out.println("Number =" + exception());
        } catch (UserExceptionValueNotNumber e) {
            System.out.println("ERROR: " + e.getMessage());
            e.getStackTrace();
        }
    }

    public static String exception() throws UserExceptionValueNotNumber {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number 1: ");
        String number = input.nextLine();
        char[] numberArr = number.toCharArray();
        for (char c : numberArr) {
            if (c > '9') {
                throw new UserExceptionValueNotNumber("NOT A NUMBER");
            }
        }
        return number;
    }
}

