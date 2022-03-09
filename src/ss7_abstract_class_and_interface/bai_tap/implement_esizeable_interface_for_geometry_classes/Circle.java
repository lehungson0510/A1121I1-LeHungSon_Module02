package ss7_abstract_class_and_interface.bai_tap.implement_esizeable_interface_for_geometry_classes;


import ss6_inheritance.thuc_hanh.GeometricalObjects.shape.Shape;

public class Circle extends Shape implements Resizeable, Area {
    private double radius = 1.1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        this.setRadius(radius + radius * percent / 100);
    }

    @Override
    public double Area() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "radius=" + radius +
                ", area=" + Area();

    }


}
