package ss2_LoopInJava.Bai_Tap;

import java.util.Scanner;

public class DisplayGeometricTypes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice=scanner.nextInt();

        switch (choice){
            case 1:
                System.out.print("enter a length: ");
                int length=scanner.nextInt();
                System.out.print("enter a width: ");
                int width=scanner.nextInt();
                for(int i=0;i<width;i++){
                    for(int j=0;j<length;j++){
                        System.out.print(" * ");
                    }
                    System.out.println("\n");
                }
                break;

            case 2:
                System.out.println(" Print the square triangle");
                System.out.println("1. Right angle in bottom-left");
                System.out.println("2. Right angle in bottom-right");
                System.out.println("3. Right angle in top-left");
                System.out.println("4. Right angle in top-right");
                System.out.print("Enter your choice: ");
                choice=scanner.nextInt();
                System.out.print("enter a heightST: ");
                int heightST = scanner.nextInt();
                switch (choice) {
                    case 1:
                    for (int i = 1; i <= heightST; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("\n");
                    }
                    break;

                    case 2:
                        for (int i = 1; i <= heightST; i++) {
                            for (int j = 1; j <= heightST; j++) {
                                if (j <= heightST - i) {
                                    System.out.print("   ");
                                }
                                else System.out.print(" * ");
                            }
                            System.out.println("\n");
                        }
                        break;

                    case 3:
                        for (int i = 0; i < heightST; i++) {
                            for (int j = 1; j <= heightST; j++) {
                                if (j <= heightST - i) {
                                    System.out.print(" * ");
                                }
                                else System.out.print("   ");
                            }
                            System.out.println("\n");
                        }
                        break;

                    case 4:
                        for (int i = 0; i < heightST; i++) {
                            for (int j = 1; j <= heightST; j++) {
                                if (j <= i) {
                                    System.out.print("   ");
                                }
                                else System.out.print(" * ");
                            }
                            System.out.println("\n");
                        }
                        break;
                }
                break;
            case 3:
                System.out.print("enter a heightIT: ");
                int heightIT = scanner.nextInt();
                for(int i=0;i<heightIT;i++){
                    for(int j=1;j<=2*heightIT-1;j++){
                        if(j>=heightIT-i&&j<=heightIT+i){
                            System.out.print(" * ");
                        }
                        else System.out.print("   ");
                    }
                    System.out.println("\n");
                }
                break;
            case 4:
                System.exit(4);
            default:
                System.out.println("No choice!");

        }

    }
}
