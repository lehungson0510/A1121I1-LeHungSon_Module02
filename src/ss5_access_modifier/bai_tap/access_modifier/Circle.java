package ss5_access_modifier.bai_tap.access_modifier;

public class Circle {
    private  double radius=1;
    private String color="red";
    public Circle(){};
    public Circle(double r){
        radius=r;
    }

    double getRadius() {
        return radius;
    }
    double getArea(){
        return Math.PI*radius*radius;
    }
}
