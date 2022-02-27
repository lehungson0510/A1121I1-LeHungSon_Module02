package ss4_Oop.Bai_Tap.Fan;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("  fan1:\n"+fan1.toString()+"\n");

        Fan fan2=new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        System.out.println("  fan2:\n"+ fan2.toString());
    }
}
