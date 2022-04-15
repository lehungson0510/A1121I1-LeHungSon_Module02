package on_thi.services.impl;

import on_thi.models.PhoneHandGoods;
import on_thi.services.PhoneHandGoodsService;
import on_thi.utils.NotFoundProductException;
import on_thi.utils.ReadWriteFile;
import on_thi.utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneHandGoodImpl implements PhoneHandGoodsService {
    static ReadWriteFile<PhoneHandGoods> readWriteFile = new ReadWriteFile<>();
    static final String PATH = "D:\\Codegym-bt\\Module02\\src\\On_thi\\data\\handbook.csv";
    static final String LINE = "ID, NAME, COST, QUANTITY, PRODUCTION COMPANY, NATIONAL HAND GOODS, STATUS";
    static Scanner input = new Scanner(System.in);


    public PhoneHandGoods createPhone() {
        try {
            List<PhoneHandGoods> handGoodsList = getPhoneHandGoods();
            int id = 1;
            if (!handGoodsList.isEmpty()) {
                int idEnd = handGoodsList.size() - 1;
                id = handGoodsList.get(idEnd).getId() + 1;
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

            System.out.println("Nhập quốc gia xách tay: ");
            String nationHandGoods;
            do {
                nationHandGoods = input.nextLine();
                if (!Regex.nationHandGoods(nationHandGoods)) {
                    System.out.println("Nhập lại (not \"Viet Nam\"): ");
                }
            } while (!Regex.nationHandGoods(nationHandGoods));

            System.out.println("Nhập trạng thái điện thoại: ");
            String status;
            do {
                status = input.nextLine();
                if (!Regex.status(status)) {
                    System.out.println("Nhập lại \"Da sua chua\" hoặc \"Chua sua chua\": ");
                }
            } while (!Regex.status(status));
            System.out.println("Thêm thành công");
            return new PhoneHandGoods(id, name, cost, quantity, productionCompany, nationHandGoods, status);
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai định dạng");
        }
        return null;
    }

    public List<PhoneHandGoods> getPhoneHandGoods() {
        List<String> stringList = readWriteFile.readFromFile(PATH);
        List<PhoneHandGoods> handGoods = new ArrayList<>();
        for (String values : stringList) {
            String[] value = values.split(",");
            handGoods.add(new PhoneHandGoods(Integer.parseInt(value[0]), value[1], Double.parseDouble(value[2]), Integer.parseInt(value[3]), value[4], value[5], value[6]));
        }
        return handGoods;
    }

    @Override
    public void addNew() {
        List<PhoneHandGoods> handGoodsList = getPhoneHandGoods();
        handGoodsList.add(createPhone());
        readWriteFile.writeToFile(handGoodsList, PATH, LINE);
    }

    @Override
    public void delete() throws NotFoundProductException {
        try {
            List<PhoneHandGoods> handGoodsList = getPhoneHandGoods();
            int choice = 0;
            boolean check = true;
            System.out.println("Nhập id điện thoại muốn xoá: ");
            int id = Integer.parseInt(input.nextLine());
            for (int i = 0; i < handGoodsList.size(); i++) {
                if (id == handGoodsList.get(i).getId()) {
                    System.out.println("Xác nhận xoá?");
                    System.out.println("1. Xoá");
                    System.out.println("2. Không");
                    System.out.println("Chọn: ");
                    choice = Integer.parseInt(input.nextLine());
                    switch (choice) {
                        case 1:
                            handGoodsList.remove(i);
                            System.out.println("Xoá thành công");
                            readWriteFile.writeToFile(handGoodsList, PATH, LINE);
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
                throw new NotFoundProductException("ID không tồn tại");
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai định dạng");
        }
    }

    @Override
    public void display() {
        List<PhoneHandGoods> handGoodsList = getPhoneHandGoods();
        if (handGoodsList.size() > 0) {
            System.out.println("Danh sách điện thoại xách tay");
            for (PhoneHandGoods handGoods : handGoodsList) {
                System.out.println(handGoods.toString1());
            }
        } else {
            System.out.println("Danh sách rỗng");
        }
    }

    @Override
    public void search() {
        try {
            List<PhoneHandGoods> handGoodsList = getPhoneHandGoods();
            System.out.println("Nhập id hoặc tên điện thoại muốn tìm kiếm: ");
            System.out.println("1. Nhập id ");
            System.out.println("2. Nhập tên điện thoại ");
            System.out.println("Chọn chức năng: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1: {
                    System.out.println("Nhập id: ");
                    int keyWord = Integer.parseInt(input.nextLine());
                    boolean check = true;
                    for (PhoneHandGoods phoneHandGoods : handGoodsList) {
                        if (keyWord == phoneHandGoods.getId()) {
                            System.out.println("Điện thoại đang tìm kiếm");
                            System.out.println(phoneHandGoods.toString1());
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
                    for (PhoneHandGoods phoneHandGoods : handGoodsList) {
                        if (phoneHandGoods.getNamePhone().contains(keyWord)) {
                            System.out.println("Điện thoại đang tìm kiếm");
                            System.out.println(phoneHandGoods.toString1());
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
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai định dạng");
        }
    }
}
