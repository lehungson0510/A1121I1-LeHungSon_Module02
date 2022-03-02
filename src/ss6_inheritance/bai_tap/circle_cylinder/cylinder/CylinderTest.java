package ss6_inheritance.bai_tap.circle_cylinder.cylinder;

import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a height: ");
        double height=input.nextDouble();

        System.out.print("Enter a radius: ");
        double radius=input.nextDouble();
        input.nextLine();

        System.out.print("Enter a color: ");
        String color=input.nextLine();


        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);

        cylinder=new Cylinder(height);
        System.out.println(cylinder);

        cylinder=new Cylinder(height,radius,color);
        System.out.println(cylinder);
    }
}
