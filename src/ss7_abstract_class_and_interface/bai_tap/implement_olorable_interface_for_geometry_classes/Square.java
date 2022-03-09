package ss7_abstract_class_and_interface.bai_tap.implement_olorable_interface_for_geometry_classes;


public class Square implements Colorable {

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

    public double getArea(){
        return side*side;
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
