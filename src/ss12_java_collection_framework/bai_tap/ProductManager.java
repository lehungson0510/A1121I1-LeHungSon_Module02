package ss12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    Scanner input = new Scanner(System.in);
    ArrayList<Product> productArrayList = new ArrayList<>();

    public Product createProduct() {
        System.out.print("Input id: ");
        String id = input.nextLine();
        System.out.print("Input name product: ");
        String nameProduct = input.nextLine();
        System.out.print("Input cost: ");
        int cost = Integer.parseInt(input.nextLine());
        return new Product(id, nameProduct, cost);
    }

    public void addProduct() {
        productArrayList.add(createProduct());
    }


    public void editProduct() {
        System.out.print("Input the id of the product you want to edit: ");
        String idEdit = input.nextLine();
        boolean flag = true;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId().contains(idEdit)) {
                productArrayList.set(i, createProduct());
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Not found id");
        }
    }

    public void deleteProduct() {
        System.out.print("Input the id of the product you want to delete: ");
        String idDelete = input.nextLine();
        boolean flag = true;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId().contains(idDelete)) {
                productArrayList.remove(i);
                i--;
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Not found id");
        }
    }

    public void displayProduct() {
        for (Product a : productArrayList) {
            System.out.println(a);
        }
    }

    public void findProduct() {
        System.out.print("Input the name of the product you want to delete: ");
        String nameProduct = input.nextLine();
        boolean flag = true;
        for (Product product : productArrayList) {
            if (product.getNameProduct().contains(nameProduct)) {
                System.out.println(product);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Not found name product");
        }

    }

    public void sortLowToHigh() {
        CostSortLowToHigh costSortLowToHigh = new CostSortLowToHigh();
        Collections.sort(productArrayList, costSortLowToHigh);
        displayProduct();
    }

    public void sortHighToLow() {
        CostSortHighToLow costSortLowToHigh = new CostSortHighToLow();
        Collections.sort(productArrayList, costSortLowToHigh);
        displayProduct();
    }
}
