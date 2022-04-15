package on_thi.services.impl;

import on_thi.models.PhoneAuthentic;
import on_thi.services.PhoneAuthenticService;
import on_thi.utils.NotFoundProductException;
import on_thi.utils.ReadWriteFile;
import on_thi.utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneAuthenticImpl implements PhoneAuthenticService {
    static final String PATH = "D:\\Codegym-bt\\Module02\\src\\On_thi\\data\\authentic.csv";
    static final String LINE = "ID, NAME, COST, QUANTITY, PRODUCTION COMPANY, WARRANTY TIME , WARRANTY SPACE";
    final String SEPARATION = ",";
    static ReadWriteFile<PhoneAuthentic> readWriteFile = new ReadWriteFile<>();
    static Scanner input = new Scanner(System.in);

    public PhoneAuthentic createPhone() {
        try {
            List<PhoneAuthentic> authenticList = getAuthenticList();
            int id = 1;
            if (!authenticList.isEmpty()) {
                int idEnd = authenticList.size() - 1;
                id = authenticList.get(idEnd).getId() + 1;
            }
            System.out.println("Nhập tên điện thoại: ");
            String name = input.nextLine();

            double cost;
            System.out.println("Nhập giá điện thoại: ");
            do {
                cost = Double.parseDouble(input.nextLine());
                if (!Regex.costQuantity(cost)) {
                    System.out.println("Nhập lại, phải là số dương: ");
                }
            } while (!Regex.costQuantity(cost));


            System.out.println("Nhập số lượng điện thoại: ");
            int quantity;
            do {
                quantity = Integer.parseInt(input.nextLine());
                if (!Regex.costQuantity(quantity))
                    System.out.println("Nhập lại, phải là số dương: ");
            }
            while (!Regex.costQuantity(quantity));

            System.out.println("Nhập hãng sản xuất: ");
            String productionCompany = input.nextLine();

            System.out.println("Nhập thời hạn bảo hành: ");
            int warrantyTime;
            do {
                warrantyTime = Integer.parseInt(input.nextLine());
                if (!Regex.warrantyTime(warrantyTime)) {
                    System.out.println("Nhập lại (>0 và <730): ");
                }
            } while (!Regex.warrantyTime(warrantyTime));

            System.out.println("Nhập phạm vi bảo hành: ");
            String warrantySpace;
            do {
                warrantySpace = input.nextLine();
                if (!Regex.warrantySpace(warrantySpace)) {
                    System.out.println("Nhập lại \"Toan Quoc\" hơặc \"Quoc Te\": ");
                }
            } while (!Regex.warrantySpace(warrantySpace));
            System.out.println("Thêm thành công");
            return new PhoneAuthentic(id, name, cost, quantity, productionCompany, warrantyTime, warrantySpace);
        } catch (NumberFormatException e) {
            System.err.println("Sai định dạng ");
        }
        return null;
    }

    public List<PhoneAuthentic> getAuthenticList() {
        List<String> stringList = readWriteFile.readFromFile(PATH);
        List<PhoneAuthentic> authentics = new ArrayList<>();
        for (String values : stringList) {
            String[] value = values.split(",");
            authentics.add(new PhoneAuthentic(Integer.parseInt(value[0]), value[1], Double.parseDouble(value[2]), Integer.parseInt(value[3]), value[4], Integer.parseInt(value[5]), value[6]));
        }
        return authentics;
    }

    @Override
    public void addNew() {
        List<PhoneAuthentic> authenticList = getAuthenticList();
        authenticList.add(createPhone());
        readWriteFile.writeToFile(authenticList, PATH, LINE);
    }

    @Override
    public void delete() throws NotFoundProductException {
        try {
            List<PhoneAuthentic> authenticList = getAuthenticList();
            int choice = 0;
            boolean check = true;
            System.out.println("Nhập id điện thoại muốn xoá: ");
            int id = Integer.parseInt(input.nextLine());
            for (int i = 0; i < authenticList.size(); i++) {
                if (id == authenticList.get(i).getId()) {
                    System.out.println("Xác nhận xoá?");
                    System.out.println("1. Xoá");
                    System.out.println("2. Không");
                    System.out.println("Chọn: ");
                    choice = Integer.parseInt(input.nextLine());
                    switch (choice) {
                        case 1:
                            authenticList.remove(i);
                            readWriteFile.writeToFile(authenticList, PATH, LINE);
                            System.out.println("Xoá thành công");
                            display();
                            check = false;
                            break;
                        case 2:
                            check = false;
                            break;
                    }
                }
            }
            if (check) {
                throw new NotFoundProductException("ID điện thoại không tồn tại");
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai định dạng");
        }
    }

    @Override
    public void display() {
        List<PhoneAuthentic> authenticList = getAuthenticList();
        if (authenticList.size() > 0) {
            System.out.println("Danh sách điện thoại chính hãng");
            for (PhoneAuthentic authentic : authenticList) {
                System.out.println(authentic.toString1());
            }
        } else {
            System.out.println("Danh sách rỗng");
        }
    }

    @Override
    public void search() {
        List<PhoneAuthentic> authenticList = getAuthenticList();
        System.out.println("Nhập id hoặc tên điện thoại muốn tìm kiếm: ");
        System.out.println("1. Nhập id ");
        System.out.println("2. Nhập tên điện thoại ");
        System.out.println("Chọn chức năng ");
        int choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case 1: {
                System.out.println("Nhập id: ");
                int keyWord = Integer.parseInt(input.nextLine());
                boolean check = true;
                for (PhoneAuthentic phoneAuthentic : authenticList) {
                    if (keyWord == phoneAuthentic.getId()) {
                        System.out.println(phoneAuthentic.toString1());
                        check = false;
                    }
                }
                if (check) {
                    System.out.println("Không tìm thấy");
                }
            }
            break;
            case 2: {
                System.out.println("Nhập tên: ");
                String keyWord = input.nextLine();
                boolean check = true;
                for (PhoneAuthentic phoneAuthentic : authenticList) {
                    if (phoneAuthentic.getNamePhone().contains(keyWord)) {
                        System.out.println(phoneAuthentic.toString1());
                        check = false;
                    }
                }
                if (check) {
                    System.out.println("Không tìm thấy");
                }
            }
            break;
            default:
                System.out.println("Chọn lại");
        }
    }
}
