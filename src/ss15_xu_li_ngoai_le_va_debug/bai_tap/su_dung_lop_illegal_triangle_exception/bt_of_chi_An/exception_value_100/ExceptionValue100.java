///*Khai báo 1 mảng có n phần tử các số nguyên, viết hàm nhập các phần tử cho mảng. Bắt ngoại lệ
//nếu nhập phần từ có giá trị là 100 thì in ra các phần tử đã nhập và kết thúc chương trình*/


package ss15_xu_li_ngoai_le_va_debug.bai_tap.su_dung_lop_illegal_triangle_exception.bt_of_chi_An.exception_value_100;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionValue100 {
    public static void main(String[] args) {
        try {
            checkValue();
        } catch (UserException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void checkValue() throws UserException {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of element: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input element "+i+": ");
            arr[i] = input.nextInt();
            if (arr[i] == 100) {
                int[] arrResult = new int[i];
                for(int j = 0; j< arrResult.length; j++){
                    arrResult[j]=arr[j];
                }
                System.out.println(Arrays.toString(arrResult));
                throw new UserException("ERROR value = 100");
            }
        }
    }
}

