package ss16_io_text_file.thuc_hanh.Tinh_tong_cac_so_trong_file_text;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileUtils fileUtils = new FileUtils();
        System.out.println("Nhập file để ghi: ");
        String fileWrite= input.nextLine();
        fileUtils.writeToFile(fileWrite);
        System.out.println("ghi thanh cong");
        System.out.println("Nhập file để đọc: ");
        String fileRead = input.nextLine();

        fileUtils.readFromToFile(fileRead);
    }
}
