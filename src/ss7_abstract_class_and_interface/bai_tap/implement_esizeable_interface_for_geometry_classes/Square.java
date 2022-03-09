package ss7_abstract_class_and_interface.bai_tap.implement_esizeable_interface_for_geometry_classes;


import ss6_inheritance.thuc_hanh.GeometricalObjects.shape.Shape;

public class Square extends Shape implements Resizeable, Area {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public void resize(double percent) {
        this.side = this.side + this.side * percent / 100;
    }

    @Override
    public double Area() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "side=" + side +
                ", area=" + Area();

    }


}

