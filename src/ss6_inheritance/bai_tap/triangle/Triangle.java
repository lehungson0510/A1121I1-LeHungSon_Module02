package ss6_inheritance.bai_tap.triangle;

public class Triangle extends Shape {
    private double side1=1.;
    private double side2=1.;
    private double side3=1.;

    public Triangle(){};

    public Triangle(String color,double side1, double side2, double side3){
        super(color);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter(){
        return this.side1+this.side2+this.side3;
    }

    public double getArea(){
        double p=getPerimeter()/2;
        p=p*(p-this.side1)*(p-this.side2)*(p-this.side3);
        return p;
    }

    public String toString(){
        return  "\nColor of triangle: \""+getColor()+"\""
                +"\n- Lengths of the sides: \n"
                +"a: "+side1
                +", b: "+side2
                +", c: "+side3
                +"\n- Perimeter: "+ getPerimeter()
                +"\n- Area: "+getArea()
                +"\nWhich is a subclass of "+super.toString();
    }
}
