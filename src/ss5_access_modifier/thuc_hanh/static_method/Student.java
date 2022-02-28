package ss5_access_modifier.thuc_hanh.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college="BBDIT";
    Student (int r,String n){
        rollno=r;
        name=n;
    }

//    public static void change(){
//        college="CODEGYM";
//    }
//
//    public void display(){
//        System.out.println(rollno+" "+name+" "+college);
//    }

//    Thay đổi acces modifier

    protected static void change(){
        college="CODEGYM";
    }

    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
