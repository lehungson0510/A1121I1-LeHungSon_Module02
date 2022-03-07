package ss7_abstract_class_and_interface.thuc_hanh.implement_comparable_interface_for_geometry_classes;

import ss6_inheritance.thuc_hanh.GeometricalObjects.circle.Circle;

public class ComparableCircle extends Circle
      implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return -1;
    }
}

