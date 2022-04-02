package ss16_io_text_file.thuc_hanh.Tim_max_ghi_ra_file;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    Scanner input = new Scanner(System.in);

//    ghi dữ liệu vào file (có thể thêm vào file có sẵn mà không bị đè)
    public void writeToFile(String path) {
        System.out.print("Input number of element: ");
        int n = Integer.parseInt(input.nextLine());
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
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

//    đọc dữ liệu từ file đã có và thêm dữ liệu vào List
    public List<Integer> readFromToFile(String path) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
               numbers.add(Integer.parseInt(line));
            }
        } catch (Exception e) {
            System.out.println("Không tồn tại file này hoặc file có dữ liệu bị lỗi");
        }
        return numbers;
    }

//    file để ghi số có giá trị lớn nhất
    public void writeValueMaxToFile(String path, int max) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(String.valueOf(max));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    tìm số lớn nhất
    public int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }
}
