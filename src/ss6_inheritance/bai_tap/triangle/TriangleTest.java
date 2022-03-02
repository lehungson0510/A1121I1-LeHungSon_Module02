package ss6_inheritance.bai_tap.triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the color of the triangle: ");
        String color=input.nextLine();
        double a,b,c;
        do {
            System.out.print("Enter the side a: ");
            a = input.nextDouble();
            System.out.print("Enter the side b: ");
            b = input.nextDouble();
            System.out.print("Enter the side c: ");
            c = input.nextDouble();
            if(!((a+b)>c&&(a+c)>b&&(b+c)>a)){
                System.out.println("\nEnter the sides of the triangle");
            }
        } while (!((a+b)>c&&(a+c)>b&&(b+c)>a));

        Triangle triangle=new Triangle(color,a,b,c);
        System.out.println(triangle);
    }
}
