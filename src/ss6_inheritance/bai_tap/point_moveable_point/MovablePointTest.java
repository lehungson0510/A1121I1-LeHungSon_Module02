package ss6_inheritance.bai_tap.point_moveable_point;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint();
        System.out.println(movablePoint);

        movablePoint=new MovablePoint(3,3,4,4);
        System.out.println(movablePoint);

        movablePoint=new MovablePoint(3,3,4,4);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
