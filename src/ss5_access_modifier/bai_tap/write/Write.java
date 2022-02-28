package ss5_access_modifier.bai_tap.write;

public class Write {
    private String name="John";
    private String classes="C02";

    public Write(){};

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setClasses(String classes) {
//        this.classes = classes;
//    }

//Thay đổi access modifier
    protected void setName(String name) {
        this.name = name;
    }

    void setClasses(String classes) {
        this.classes = classes;
    }
}

