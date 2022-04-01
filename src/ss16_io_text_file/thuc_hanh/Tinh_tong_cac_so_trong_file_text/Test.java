package ss16_io_text_file.thuc_hanh.Tinh_tong_cac_so_trong_file_text;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileUtils fileUtils = new FileUtils();
        fileUtils.writeToFile("danh sach so nguyen.txt");
        System.out.println("ghi thanh cong");

        System.out.println("Nhập file: ");
        String file = input.nextLine();
        fileUtils.readFromToFile(file);
    }
}
