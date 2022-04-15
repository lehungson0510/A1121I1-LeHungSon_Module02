package on_thi.models;

public abstract class Phone {
    private int id;
    private String namePhone;
    private double cost;
    private int quantity;
    private String productionCompany;

    public Phone() {
    }

    public Phone(int id, String namePhone, double cost, int quantity, String productionCompany) {
        this.id = id;
        this.namePhone = namePhone;
        this.cost = cost;
        this.quantity = quantity;
        this.productionCompany = productionCompany;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public String toString1() {
        return "id=" + id +
                ", namePhone='" + namePhone + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", productionCompany='" + productionCompany + '\'';
    }

    @Override
    public String toString() {
        return id + "," +
                namePhone + "," +
                cost + "," +
                quantity + "," +
                productionCompany;

    }
}
