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
        System.out.println("Enter your choice: ");
        int choice=scanner.nextInt();
        System.out.println("enter a height");
        int height=scanner.nextInt();
        System.out.println("enter a width");
        int width=scanner.nextInt();
        switch (choice){
            case 1:
                for(int i=0;i<width;i++){
                    for(int j=0;j<height;j++){
                        System.out.print(" * ");
                    }
                    System.out.println("\n");
                }
            case 2:
                for(int i=0;i<height;i++){
                    for(int j=0;j<=i;j++){
                        System.out.print(" * ");
                    }
                    System.out.println("\n");
                }
        }

    }
}
