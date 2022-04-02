package ss16_io_text_file.bai_tap.copy_file_text;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ReadWriteAndCopyFile copyFile = new ReadWriteAndCopyFile();

        System.out.println("Nhập file để ghi: ");
        String fileWrite= input.nextLine();
        copyFile.writeToFile(fileWrite);
        System.out.println("\nGhi thành công");

        System.out.println("\nNhập file để đọc: ");
        String fileRead = input.nextLine();
        List<String> strings = copyFile.readFromToFile(fileRead);

        System.out.println("Nhập file để ghi dữ liệu copy");
        String fileCopy = input.nextLine();
        try {
            copyFile.copyFile(strings,fileCopy);
        } catch (ExceptionExist e) {
            System.err.println("Lỗi: "+e.getMessage());
        }
    }
}
