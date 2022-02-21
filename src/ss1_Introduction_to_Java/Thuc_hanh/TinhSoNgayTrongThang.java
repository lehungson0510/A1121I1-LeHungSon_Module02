package ss1_Introduction_to_Java.Thuc_hanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        System.out.println("Which month that you want to count days? ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String dayInMonth;
        switch (month) {
            case 2:
                dayInMonth="28 or 29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth="30";
                break;
            default:
                dayInMonth="31";
                break;
        }
        System.out.println("Month "+month+" is "+dayInMonth+" day");
    }
}




