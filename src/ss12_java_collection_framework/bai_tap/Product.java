package ss12_java_collection_framework.bai_tap;

public class Product {
    private String productName;
    private int id;

    public Product(){}

    public Product(String productName, int id) {
        this.productName = productName;
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", id=" + id +
                '}';
    }
}
