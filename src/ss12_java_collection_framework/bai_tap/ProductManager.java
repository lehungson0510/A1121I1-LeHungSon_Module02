package ss12_java_collection_framework.bai_tap;


import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Product> lists = new ArrayList<>();

    public void addProduct(Product product) {
        lists.add(product);
    }

    public void editProduct() {

    }

    public void deleteProduct(Product product, int id) {

        lists.remove(product);

    }

    public void displayProduct(int index) {
        lists.get(index);
    }

    public void searchProduct() {

    }

    public void sortProduct() {

    }
}
