package ss17_binary_file_and_serialization.thuc_hanh.doc_va_ghi_danh_sach_sv_ra_file_nhi_phan;

import com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Lê Hùng Sơn", "Huế"));
        students.add(new Student(2, "Nguyễn Văn Trường", " Huế"));
        students.add(new Student(3, "Lê Viết Tường Huy", "Huế"));
        students.add(new Student(4, "Bùi Đoàn Tiểu My", "Huế"));
        students.add(new Student(5, "Cao Thị Hồng Đức", "Huế"));
        students.add(new Student(6, "Bùi Thị Ái Nhi", "Huế"));

        System.out.println("Nhập file để ghi: ");
        String fileWrite= input.nextLine();
        Test test = new Test();
        test.writeFileObject(fileWrite,students);
        System.out.println("Ghi thành công");

        students = test.readFileObject(fileWrite);
        students.forEach(System.out::println);
    }

    public void writeFileObject(String path, List<Student> studentList) {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(path))) {
            stream.writeObject(studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Student> readFileObject(String path) {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(path))) {
            return (List<Student>) stream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
