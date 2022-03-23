package ss12_java_collection_framework.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductManager products = new ProductManager();
        boolean check = true;
        while (check) {
            System.out.println(" 1. ADD PRODUCT");
            System.out.println(" 2. EDIT");
            System.out.println(" 3. DELETE");
            System.out.println(" 4. DISPLAY");
            System.out.println(" 5. SEARCH");
            System.out.println(" 6. SORT (low to high)");
            System.out.println(" 7. SORT (high to low)");
            System.out.println(" 8. EXIT");
            System.out.print("Input your choice: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    products.addProduct();
                    break;
                case 2:
                    products.editProduct();
                    break;
                case 3:
                    products.deleteProduct();
                    break;
                case 4:
                    products.displayProduct();
                    break;
                case 5:
                    products.findProduct();
                    break;
                case 6:
                    products.sortLowToHigh();
                    break;
                case 7:
                    products.sortHighToLow();
                    break;
                case 8:
                    check = false;
                    break;
                default:
                    System.out.println("Choice again");
            }
        }
    }
}

