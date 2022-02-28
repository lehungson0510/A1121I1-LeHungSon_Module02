package ss4_oop.Bai_Tap.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a=input.nextDouble();
        System.out.print("Nhap b: ");
        double b=input.nextDouble();
        System.out.print("Nhap c: ");
        double c=input.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        if( quadraticEquation.getDiscriminant()>0){
            System.out.print("Pt co 2 nghiem:\nr1= "+quadraticEquation.getRoot1()+"\nr2= "+quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.println("\nPt co nghiem kep= "+quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }


    }
}
