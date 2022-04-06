package ss17_binary_file_and_serialization.bai_tap.quan_li_san_pham_luu_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestProduct {
    static List<Product> productList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        TestProduct product = new TestProduct();
        boolean choice = true;
        while (choice) {
            System.out.println("----Menu---");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Exit");

            Scanner input = new Scanner(System.in);
            System.out.print("Nhập lựa chọn: ");
            switch (Integer.parseInt(input.nextLine())) {
                case 1:
                    product.addNew("Product.csv");
                    break;
                case 2:
                    product.display("Product.csv");
                    break;
                case 3:
                    product.searchProduct("Product.csv");
                    break;
                case 4:
                    choice = false;
                    break;
                default:
                    System.out.println("Chọn lại");
            }
        }

    }

    public Product createProduct() {
        System.out.print("Input id: ");
        String id = input.nextLine();

        System.out.print("Input name product: ");
        String nameProduct = input.nextLine();

        System.out.print("Input name Manufacturing: ");
        String nameManufacturing = input.nextLine();

        System.out.print("Input cost:");
        double cost = Double.parseDouble(input.nextLine());

        return new Product(id, nameProduct, nameManufacturing, cost);
    }

    public void addNew(String path) {
        productList.add(createProduct());
        System.out.println("Thêm thành công");
        writeFileObject(path, productList);
    }

    public void display(String path) {
        List<Product> products = readFileObject(path);
        products.forEach(System.out::println);
    }

    public void searchProduct(String path) {
        System.out.print("Input the id you want to find: ");
        String id = input.nextLine();
        int size = productList.size();
        boolean flag = true;
        for (Product product : readFileObject(path)) {
            if (id.equals(product.getId())) {
                System.out.println(product);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Không tìm thấy");
        }
    }

    public void writeFileObject(String path, List<Product> products) {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(path))) {
            stream.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> readFileObject(String path) {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(path))) {
            return (List<Product>) stream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
