package ss7_abstract_class_and_interface.bai_tap.implement_esizeable_interface_for_geometry_classes;


import ss6_inheritance.thuc_hanh.GeometricalObjects.shape.Shape;

public class Rectangle extends Shape implements Resizeable, Area {
    private double height = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void resize(double percent) {
        this.setHeight(height + height * percent / 100);
        this.setLength(length + length * percent / 100);
    }

    @Override
    public double Area() {
        return this.length * this.height;
    }

    @Override
    public String toString() {
        return "height=" + height +
                ", length=" + length +
                ", area=" + Area();

    }
}
