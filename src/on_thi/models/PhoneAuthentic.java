package on_thi.models;

public class PhoneAuthentic extends Phone {
    //    thời gian bảo hành
    private int warrantyTime;

    //    phạm vi bảo hành(trong nước hay nước ngoài)
    private String warrantySpace;

    public PhoneAuthentic() {
    }

    public PhoneAuthentic(int id, String namePhone, double cost, int quantity, String productionCompany, int warrantyTime, String warrantySpace) {
        super(id, namePhone, cost, quantity, productionCompany);
        this.warrantyTime = warrantyTime;
        this.warrantySpace = warrantySpace;
    }

    public int getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(int warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    public String getWarrantySpace() {
        return warrantySpace;
    }

    public void setWarrantySpace(String warrantySpace) {
        this.warrantySpace = warrantySpace;
    }


    public String toString1() {
        return "PhoneAuthentic{" + super.toString1() +
                ", warrantyTime='" + warrantyTime + '\'' +
                ", warrantySpace='" + warrantySpace + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return super.toString() + ","
                + warrantyTime + ","
                + warrantySpace;
    }
}
