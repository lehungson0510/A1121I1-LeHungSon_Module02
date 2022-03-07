package ss7_abstract_class_and_interface.thuc_hanh.implement_implement_comparator_interface_to_compare_geometry_class;

import ss6_inheritance.thuc_hanh.GeometricalObjects.circle.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}

