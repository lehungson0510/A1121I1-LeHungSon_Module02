//Tìm tên sinh viên trong mảng
package ss3_Array_MethodInJava.Thuc_Hanh;

import java.util.Scanner;

public class FindValueOfArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] students = {"a", "b", "c", "d", "e", "f", "g", "h"};
        System.out.print("Input name of student: ");
        String nameStudent = input.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(nameStudent)) {
                System.out.print("Position of the students in the list: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.print("Not found " + nameStudent + " in the list.");
    }
}
