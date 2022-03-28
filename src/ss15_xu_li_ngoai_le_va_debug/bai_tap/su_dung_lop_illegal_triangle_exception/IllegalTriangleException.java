package ss15_xu_li_ngoai_le_va_debug.bai_tap.su_dung_lop_illegal_triangle_exception;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = input.nextInt();
        System.out.println("Input b: ");
        int b = input.nextInt();
        System.out.println("Input c: ");
        int c = input.nextInt();
    }
    public void throwError(int a, int b, int c){
        if(a<0||b<0||c<0||(a+b)<c||(b+c)<a||(c+a)<b){
            throw new illegalTriangle("")
        }
    }
}
