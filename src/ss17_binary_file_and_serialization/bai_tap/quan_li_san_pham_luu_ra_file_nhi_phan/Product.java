package ss17_binary_file_and_serialization.bai_tap.quan_li_san_pham_luu_ra_file_nhi_phan;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String nameProduct;
    private String nameManufacturing;
    private double cost;

    public Product() {}

    public Product(String id, String nameProduct, String nameManufacturing, double cost) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.nameManufacturing = nameManufacturing;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameManufacturing() {
        return nameManufacturing;
    }

    public void setNameManufacturing(String nameManufacturing) {
        this.nameManufacturing = nameManufacturing;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", nameManufacturing='" + nameManufacturing + '\'' +
                ", cost=" + cost +
                '}';
    }
}
