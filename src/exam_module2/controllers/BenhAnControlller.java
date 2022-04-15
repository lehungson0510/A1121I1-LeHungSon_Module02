package exam_module2.controllers;


import exam_module2.services.BenhAnThuongService;
import exam_module2.services.BenhAnVipService;
import exam_module2.services.iplm.BenhAnThuongIplm;
import exam_module2.services.iplm.BenhAnVipIplm;
import exam_module2.ultis.NotFoundMedicalRecordException;

import java.util.Scanner;

public class BenhAnControlller {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        displayMainMenu();

    }

    public static void displayMainMenu(){
        boolean check = true;
        int choice = 0;
        while (check){
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÍ BỆNH ÁN--");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xoá");
            System.out.println("3. Xem danh sách bệnh án");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice){
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
                    System.exit(0);
            }
        }
    }

    public static void addNew() {
        BenhAnThuongService thuongService = new BenhAnThuongIplm();
        BenhAnVipService vipService = new BenhAnVipIplm();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. Thêm bệnh án thường");
            System.out.println("2. Thêm bệnh án vip");
            System.out.println("3. Hiển thị lại menu chính");
            System.out.println("Chọn chức năng: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Nhập sai định dạng");
            }

            switch (choice) {
                case 1:
                    thuongService.addNew();
                    break;
                case 2:
                    vipService.addNew();
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
        BenhAnThuongService thuongService = new BenhAnThuongIplm();
        BenhAnVipService vipService = new BenhAnVipIplm();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. Xoá bệnh án thường");
            System.out.println("2. Xoá bệnh án vip");
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
                        thuongService.delete();
                    } catch (NotFoundMedicalRecordException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        vipService.delete();
                    } catch (NotFoundMedicalRecordException e) {
                        System.err.println(e.getMessage());
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
        BenhAnThuongService thuongService = new BenhAnThuongIplm();
        BenhAnVipService vipService = new BenhAnVipIplm();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. Hiển thị danh sách bệnh án thường");
            System.out.println("2. Hiển thị danh sách bệnh án vip");
            System.out.println("3. Hiển thị lại menu chính");
            System.out.println("Chọn chức năng: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    thuongService.display();
                    break;
                case 2:
                    vipService.display();
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
