package on_thi.models;

public class PhoneHandGoods extends Phone {
    //    Quốc gia xách tay
    private String nationHandGoods;

    private String status;

    public PhoneHandGoods() {
    }

    public PhoneHandGoods(int id, String namePhone, double cost, int quantity, String productionCompany, String nationHandGoods, String status) {
        super(id, namePhone, cost, quantity, productionCompany);
        this.nationHandGoods = nationHandGoods;
        this.status = status;
    }

    public String getNationHandGoods() {
        return nationHandGoods;
    }

    public void setNationHandGoods(String nationHandGoods) {
        this.nationHandGoods = nationHandGoods;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String toString() {
        return super.toString() + ","
                + nationHandGoods + ","
                + status;
    }

    @Override
    public String toString1() {
        return "PhoneHandGoods{" + super.toString1()+
                ", nationHandGoods='" + nationHandGoods + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
