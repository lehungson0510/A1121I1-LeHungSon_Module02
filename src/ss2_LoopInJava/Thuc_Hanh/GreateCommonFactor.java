//Tìm UCLN
package ss2_LoopInJava.Thuc_Hanh;

import java.util.Scanner;

public class GreateCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number1: ");
        int number1 = scanner.nextInt();
        System.out.print("enter a number2: ");
        int number2 = scanner.nextInt();
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);
        if (number1 == 0 && number2 == 0) {
            System.out.println("No greatest common factor");
        }
        if ((number1 == 0 && number2 != 0) || (number1 != 0 && number2 == 0)) {
            if (number1 > number2) {
                System.out.println("Greatest common factor: " + number1);
            } else {
                System.out.println("Greatest common factor: " + number2);
            }
        }
        else {
            while (number1 != number2){
                if(number1>number2)
                    number1=number1-number2;
                else number2=number2-number1;
            }
            System.out.println("Greatest common factor: " + number1);

        }
    }
}
