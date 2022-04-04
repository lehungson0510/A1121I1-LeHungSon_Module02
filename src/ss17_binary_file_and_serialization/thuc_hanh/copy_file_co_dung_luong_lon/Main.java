package ss17_binary_file_and_serialization.thuc_hanh.copy_file_co_dung_luong_lon;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {

//        Files.copy : Copy file nguồn sang file đích
//        source.toPath(), dest.toPath(): lấy đường dẫn tập tin
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) {

        try {InputStream is = new FileInputStream(source);
             OutputStream os = new FileOutputStream(dest,true);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter source file:");
        String sourcePath = input.nextLine();
        System.out.print("Enter destination file:");
        String destPath = input.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingJava7Files(sourceFile, destFile);
//            copyFileUsingStream(sourceFile, destFile);
            System.out.println("Copy completed");
        } catch (IOException ioe) {
            System.out.println("Can't copy that file");
            System.out.println(ioe.getMessage());
        }
    }
}
