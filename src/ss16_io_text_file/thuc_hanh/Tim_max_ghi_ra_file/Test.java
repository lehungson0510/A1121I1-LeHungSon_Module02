package ss16_io_text_file.thuc_hanh.Tim_max_ghi_ra_file;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

        System.out.println("Nhập file để ghi: ");
        String fileWrite= input.nextLine();
        readAndWriteFile.writeToFile(fileWrite);
        System.out.println("ghi thanh cong");

        System.out.println("Nhập file để đọc: ");
        String fileRead = input.nextLine();

        List<Integer> numbers = readAndWriteFile.readFromToFile(fileRead);

        int maxValue = readAndWriteFile.findMax(numbers);
        System.out.println("Nhập file để ghi giá trị lớn nhất");
        String fileWriteValueMax= input.nextLine();
        readAndWriteFile.writeValueMaxToFile(fileWriteValueMax, maxValue);


    }
}
