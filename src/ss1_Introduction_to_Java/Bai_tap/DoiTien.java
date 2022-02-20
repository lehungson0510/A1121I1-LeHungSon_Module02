package ss1_Introduction_to_Java.Bai_tap;

import java.util.Scanner;

public class DoiTien {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double vnd;

        System.out.print("usd= ");
        double usd=scanner.nextDouble();

        System.out.printf("vnd= %.2f",usd*23000);
    }
}
