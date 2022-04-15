package on_thi.controllers;

import on_thi.services.PhoneAuthenticService;
import on_thi.services.PhoneHandGoodsService;
import on_thi.services.impl.PhoneAuthenticImpl;
import on_thi.services.impl.PhoneHandGoodImpl;
import on_thi.utils.NotFoundProductException;

import java.util.Scanner;

public class MobileController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    static Scanner input = new Scanner(System.in);

    public static void displayMainMenu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("Chương trình quản lí điện thoại");
            System.out.println("Chọn chức năng theo số(để tiếp tục)");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xoá");
            System.out.println("3. Xem danh sách");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    addNew();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    displayList();
                    break;
                case 4:
                    search();
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Chọn lại");
            }
        }
    }

    public static void addNew() {
        PhoneHandGoodsService phoneHandGoods = new PhoneHandGoodImpl();
        PhoneAuthenticService phoneAuthentic = new PhoneAuthenticImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. Thêm điện thoại chính hãng");
            System.out.println("2. Thêm điện thoại xách tay");
            System.out.println("3. Hiển thị lại menu chính");
            System.out.println("Chọn chức năng: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Nhập sai định dạng");
            }

            switch (choice) {
                case 1:
                    phoneAuthentic.addNew();
                    break;
                case 2:
                    phoneHandGoods.addNew();
                    break;
                case 3:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Chọn lại");
            }
        }
    }

    public static void delete() {
        PhoneHandGoodsService phoneHandGoods = new PhoneHandGoodImpl();
        PhoneAuthenticService phoneAuthentic = new PhoneAuthenticImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. Xoá điện thoại chính hãng");
            System.out.println("2. Xoá điện thoại xách tay");
            System.out.println("3. Hiển thị lại menu chính");
            System.out.println("Chọn chức năng: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e){
                System.err.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    try {
                        phoneAuthentic.delete();
                    } catch (NotFoundProductException e) {
                        System.out.println("Lỗi "+e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        phoneHandGoods.delete();
                    } catch (NotFoundProductException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Chọn lại");
            }
        }
    }

    public static void displayList() {
        PhoneHandGoodsService phoneHandGoods = new PhoneHandGoodImpl();
        PhoneAuthenticService phoneAuthentic = new PhoneAuthenticImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. Hiển thị danh sách điện thoại chính hãng");
            System.out.println("2. Hiển thị danh sách điện thoai xách tay");
            System.out.println("3. Hiển thị lại menu chính");
            System.out.println("Chọn chức năng: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    phoneAuthentic.display();
                    break;
                case 2:
                    phoneHandGoods.display();
                    break;
                case 3:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Chọn lại");
            }
        }
    }

    public static void search() {
        PhoneHandGoodsService phoneHandGoods = new PhoneHandGoodImpl();
        PhoneAuthenticService phoneAuthentic = new PhoneAuthenticImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. Tìm kiếm điện thoại chính hãng ");
            System.out.println("2. Tìm kiếm điện thoại xách tay ");
            System.out.println("3. Hiển thị lại menu chính");
            System.out.println("Chọn chức năng: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    phoneAuthentic.search();
                    break;
                case 2:
                    phoneHandGoods.search();
                    break;
                case 3:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Chọn lại");
            }
        }
    }
}
