package ss16_io_text_file.bai_tap.copy_file_text;

import ss16_io_text_file.thuc_hanh.Tinh_tong_cac_so_trong_file_text.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWriteAndCopyFile {
    Scanner input = new Scanner(System.in);

    //    ghi dữ liệu vào file (có thể thêm vào file có sẵn mà không bị đè)
    public void writeToFile(String path) {
        System.out.println("Nhap chuoi");
        String string = input.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //đọc dữ liệu từ file
    public List<String> readFromToFile(String path) {
        List<String> string = new ArrayList<>();
        try {
            File file = new File(path);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = br.readLine()) != null) {
                string.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Lỗi: Tệp nguồn không tồn tại");
        } catch (Exception e) {
            System.out.println("Có dữ liệu bị lỗi");
        }
        return string;
    }

    public void copyFile(List<String> strings, String path) throws ExceptionExist {
        try {
            File file = new File(path);

//            Kiểm tra xem file(path) có tồn tại hay chưa
            if(file.exists()){
                throw new ExceptionExist("Tệp đích đã tồn tại");
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            int soKyTu = 0;
            for (String string : strings) {
                writer.write(string);
                string.split("");

//                đếm số ký tự
                for (int i = 0; i < string.length(); i++) {
                    soKyTu++;
                }
            }
            writer.newLine();
            writer.write("Số ký tự: " + soKyTu);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
