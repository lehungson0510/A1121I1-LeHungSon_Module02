package ss7_abstract_class_and_interface.bai_tap.implement_esizeable_interface_for_geometry_classes;

import ss6_inheritance.thuc_hanh.GeometricalObjects.shape.Shape;

public class ResizeableTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(2, 3);
        shapes[1] = new Circle(4);
        shapes[2] = new Square(5);
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                System.out.println("Rectangle: \n-Before resize: " + shape);
                ((Rectangle) shape).resize(((Math.random()) * ((100 - 1) + 1)) + 1);
                System.out.println("-After resize: " + shape);
            }

            if (shape instanceof Circle) {
                System.out.println("\nCircle: \n-Before resize: " + shape);
                ((Circle) shape).resize(((Math.random()) * ((100 - 1) + 1)) + 1);
                System.out.println("-After resize: " + shape);
            }

            if (shape instanceof Square) {
                System.out.println("\nSquare: \n-Before resize: " + shape);
                ((Square) shape).resize(((Math.random()) * ((100 - 1) + 1)) + 1);
                System.out.println("-After resize: " + shape);
            }

        }
    }
}
