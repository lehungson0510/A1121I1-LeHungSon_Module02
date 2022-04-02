package ss16_io_text_file.thuc_hanh.Tinh_tong_cac_so_trong_file_text;

import java.io.*;
import java.util.Scanner;

public class FileUtils {
    Scanner input = new Scanner(System.in);

    public void writeToFile(String path) {
        System.out.print("Input number of element: ");
        int n = Integer.parseInt(input.nextLine());
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            String[] arr = new String[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Input arr[" + i + "]: ");
                arr[i] = input.nextLine();
                writer.write(arr[i]);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromToFile(String path) {
        int sum = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                    sum += Integer.parseInt(line);
                    System.out.println(line);
            }
            System.out.println("Sum = "+sum);
        } catch (Exception e) {
            System.out.println("Không tồn tại file này hoặc file có dữ liệu bị lỗi");
        }
    }
}

