package ss6_inheritance.bai_tap.point2d_3d;

import java.util.Scanner;

public class Test3D {
    public static void main(String[] args) {
        Point3D point3D=new Point3D();
        System.out.println(point3D);

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x: ");
        float x=scanner.nextFloat();
        System.out.print("Enter y: ");
        float y=scanner.nextFloat();
        System.out.print("Enter z: ");
        float z=scanner.nextFloat();
        point3D=new Point3D(x,y,z);
        System.out.println(point3D);
    }
}
