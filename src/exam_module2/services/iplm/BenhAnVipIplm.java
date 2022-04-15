package exam_module2.services.iplm;

import exam_module2.models.BenhAnThuong;
import exam_module2.models.BenhAnVip;
import exam_module2.services.BenhAnVipService;
import exam_module2.ultis.NotFoundMedicalRecordException;
import exam_module2.ultis.ReadWriteFile;
import exam_module2.ultis.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnVipIplm implements BenhAnVipService {
    static ReadWriteFile<BenhAnVip> readWriteFile = new ReadWriteFile<>();
    static final String PATH = "D:\\Codegym-bt\\Module02\\src\\exam_module2\\data\\vip.csv";
    static final String LINE = "stt, mã bệnh án, tên bệnh nhân, ngày nhập viện, ngày ra viện, lí do nhập viện, loại vip, thời hạn vip";
    static Scanner input = new Scanner(System.in);


    public BenhAnVip create() {
        List<BenhAnVip> anVips = getAnVipList();
        int stt = 1;
        if (!anVips.isEmpty()) {
            int indexEnd = anVips.size() - 1;
            stt = anVips.get(indexEnd).getStt() + 1;
        }

        System.out.println("Nhập mã bệnh án: ");
        String maBenhAn;
        do {
            maBenhAn = input.nextLine();
            if(!Regex.maBenhAn(maBenhAn)){
                System.out.println("Sai định dạng, Nhập lại(BA-XXX) x là số: ");
            }
        }while (!Regex.maBenhAn(maBenhAn));

        System.out.println("Nhập tên bệnh nhân: ");
        String tenBenhNhan;
        do {
            tenBenhNhan = input.nextLine();
            if(!Regex.maBenhNhan(tenBenhNhan)){
                System.out.println("Sai định dạng, Nhập lại(BN-XXX) x là số: ");
            }
        }while (!Regex.maBenhNhan(tenBenhNhan));

        System.out.println("Nhập ngày nhập viện: ");
        String ngayNhapVien = input.nextLine();

        System.out.println("Nhập ngày ra viện: ");
        String ngayRaVien = input.nextLine();

        System.out.println("Nhập lí do nhập viện: ");
        String liDo = input.nextLine();

        System.out.println("Nhập loại vip: ");
        String loaiVip = input.nextLine();

        System.out.println("Nhập thời hạn vip: ");
        double thoiHan = Double.parseDouble(input.nextLine());

        System.out.println("--Thêm thành công--");
        return new BenhAnVip(stt, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, liDo, loaiVip, thoiHan);
    }

    public List<BenhAnVip> getAnVipList() {
        List<String> stringList = readWriteFile.readFromFile(PATH);
        List<BenhAnVip> anVips = new ArrayList<>();
        for (String values : stringList) {
            String[] value = values.split(",");
            anVips.add(new BenhAnVip(Integer.parseInt(value[0]), value[1], (value[2]), (value[3]), value[4], (value[5]), (value[6]), Double.parseDouble(value[7])));
        }
        return anVips;
    }

    @Override
    public void display() {
        List<BenhAnVip> anVips = getAnVipList();
        if (anVips.size() > 0) {
            System.out.println("Danh sách bệnh án thường ");
            for (BenhAnVip anVip : anVips) {
                System.out.println(anVip.toString1());
            }
        } else {
            System.out.println("Danh sách rỗng");
        }
    }

    @Override
    public void addNew() {
        List<BenhAnVip> anVips = getAnVipList();
        anVips.add(create());
        readWriteFile.writeToFile(anVips, PATH, LINE);
    }

    @Override
    public void delete() throws NotFoundMedicalRecordException {
        List<BenhAnVip> anVips = getAnVipList();
        int choice = 0;
        boolean check = true;
        System.out.println("Nhập mã bệnh án muốn xoá ");
        String maBenhAn = input.nextLine();
        for (int i = 0; i < anVips.size(); i++) {
            if (maBenhAn.equals(anVips.get(i).getMaBenhAn())) {
                System.out.println("Xác nhận xoá?");
                System.out.println("1. Xoá");
                System.out.println("2. Không");
                System.out.println("Chọn: ");
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        anVips.remove(i);
                        readWriteFile.writeToFile(anVips, PATH, LINE);
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
            throw new NotFoundMedicalRecordException("Bệnh án không tồn tại");
        }
    }
}
