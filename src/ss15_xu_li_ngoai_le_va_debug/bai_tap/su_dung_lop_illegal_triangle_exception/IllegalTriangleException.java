package ss15_xu_li_ngoai_le_va_debug.bai_tap.su_dung_lop_illegal_triangle_exception;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = input.nextInt();
        System.out.print("Input b: ");
        int b = input.nextInt();
        System.out.print("Input c: ");
        int c = input.nextInt();
//        throwError(a, b ,c);

        try {
            throwError(a, b, c);
        } catch (UserException e) {
            System.out.println("The program is faulty: " + e.getMessage());
        }
    }

        public static void throwError(int a, int b, int c) throws UserException {
        if (a < 0 || b < 0 || c < 0 || ((a + b) <= c) || ((b + c)) <= a || ((c + a) <= b)) {
            throw new UserException("Invalid side lengths");
        } else System.out.println("Valid side lengths");

    }

//    public static void throwError(int a, int b, int c) {
//        if (a < 0 || b < 0 || c < 0 || ((a + b) <= c) || ((b + c)) <= a || ((c + a) <= b)) {
//            try {
//                throw new UserException("Invalid side lengths");
//            } catch (UserException e) {
//                System.out.println("The program is faulty: " + e.getMessage());
//            }
//        } else System.out.println("Valid side lengths");
//    }
}
