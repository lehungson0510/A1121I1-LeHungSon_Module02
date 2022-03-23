package ss12_java_collection_framework.bai_tap;

import java.util.Comparator;

public class Product {
    private String id;
    private String nameProduct;
    private int cost;

    public Product() {
    }

    public Product(String id, String nameProduct, int cost) {
        this.id = id;
        this.nameProduct = nameProduct;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + cost +
                '}';
    }
}
