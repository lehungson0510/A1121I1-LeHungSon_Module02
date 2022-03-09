package ss7_abstract_class_and_interface.bai_tap.implement_olorable_interface_for_geometry_classes;

import ss6_inheritance.thuc_hanh.GeometricalObjects.shape.Shape;

public class ColorableTest {
    public static void main(String[] args) {
        Square square = new Square(3.5);
        System.out.println("Area: "+square.getArea());
        square.howToColor();
    }
}
