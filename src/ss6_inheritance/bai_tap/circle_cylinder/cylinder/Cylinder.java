package ss6_inheritance.bai_tap.circle_cylinder.cylinder;

import ss6_inheritance.bai_tap.circle_cylinder.circle.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){};

    public Cylinder(double height){
        this.height=height;
    }

    public Cylinder(double height,double radius, String color){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public String toString(){
        return "A cylinder with height= "
                +getHeight()
                +", radius of bottom= "+getRadius()
                +", color= "
                +getColor()
                +", volume= "
                +getVolume()
                +", which is subclass of "
                + super.toString();

    }
}
