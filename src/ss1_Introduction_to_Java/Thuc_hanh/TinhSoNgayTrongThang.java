package ss1_Introduction_to_Java.Thuc_hanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        System.out.println("Which month that you want to count days? ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.print("The month '2' has 28 or 29 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("The month %d has 30 days!",month);
                break;
            default:
                System.out.printf("The month %d has 31 days!", month);
                break;
        }
    }
}




