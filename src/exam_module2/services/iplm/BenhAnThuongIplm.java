package exam_module2.services.iplm;


import exam_module2.models.BenhAnThuong;
import exam_module2.services.BenhAnThuongService;
import exam_module2.ultis.NotFoundMedicalRecordException;
import exam_module2.ultis.ReadWriteFile;
import exam_module2.ultis.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnThuongIplm implements BenhAnThuongService {
    static ReadWriteFile<BenhAnThuong> readWriteFile = new ReadWriteFile<>();
    static final String PATH = "D:\\Codegym-bt\\Module02\\src\\exam_module2\\data\\thuong.csv";
    static final String LINE = "stt, mã bệnh án, tên bệnh nhân, ngày nhập viện, ngày ra viện, lí do nhập viện, phí";
    static Scanner input = new Scanner(System.in);


    public BenhAnThuong create() {
        List<BenhAnThuong> anThuongList = getAnThuongList();
        int stt = 1;
        if (!anThuongList.isEmpty()) {
            int indexEnd = anThuongList.size() - 1;
            stt = anThuongList.get(indexEnd).getStt() + 1;
        }
        System.out.println("Nhập mã bệnh án: ");
        String maBenhAn;
        do {
            maBenhAn = input.nextLine();
            if(!Regex.maBenhAn(maBenhAn)){
                System.out.println("Sai định dạng, Nhập lại(BA-XXX) x là số: ");
            }
        }while (!Regex.maBenhAn(maBenhAn));

//        String maBenhAn = input.nextLine();


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

        System.out.println("Nhập phí nằm viện: ");
        double phi = Double.parseDouble(input.nextLine());

        System.out.println("--Thêm thành công--");
        return new BenhAnThuong(stt, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, liDo, phi);
    }

    public List<BenhAnThuong> getAnThuongList() {
        List<String> stringList = readWriteFile.readFromFile(PATH);
        List<BenhAnThuong> anThuongs = new ArrayList<>();
        for (String values : stringList) {
            String[] value = values.split(",");
            anThuongs.add(new BenhAnThuong(Integer.parseInt(value[0]), value[1], (value[2]), (value[3]), value[4], (value[5]), Double.parseDouble(value[6])));
        }
        return anThuongs;
    }

    @Override
    public void display() {
        List<BenhAnThuong> benhAnThuongs = getAnThuongList();
        if (benhAnThuongs.size() > 0) {
            System.out.println("Danh sách bệnh án thường");
            for (BenhAnThuong anThuong : benhAnThuongs) {
                System.out.println(anThuong.toString1());
            }
        } else {
            System.out.println("Danh sách rỗng");
        }
    }

    @Override
    public void addNew() {
        List<BenhAnThuong> benhAnThuongs = getAnThuongList();
        benhAnThuongs.add(create());
        readWriteFile.writeToFile(benhAnThuongs, PATH, LINE);
    }

    @Override
    public void delete() throws NotFoundMedicalRecordException {
        List<BenhAnThuong> benhAnThuongs = getAnThuongList();
        int choice = 0;
        boolean check = true;
        System.out.println("Nhập mã bệnh án muốn xoá ");
        String maBenhAn = input.nextLine();
        for (int i = 0; i < benhAnThuongs.size(); i++) {
            if (maBenhAn.equals(benhAnThuongs.get(i).getMaBenhAn())) {
                System.out.println("Xác nhận xoá?");
                System.out.println("1. Xoá");
                System.out.println("2. Không");
                System.out.println("Chọn: ");
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        benhAnThuongs.remove(i);
                        readWriteFile.writeToFile(benhAnThuongs, PATH, LINE);
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
