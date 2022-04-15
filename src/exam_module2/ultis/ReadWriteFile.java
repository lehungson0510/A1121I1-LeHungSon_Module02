package exam_module2.ultis;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ReadWriteFile <T>{

    public void writeToFile(Collection<T> collection, String path, String inputHeader) {
        File file = new File(path);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(inputHeader);
            for (T element : collection) {
                if (element != null) {
                    writer.newLine();
                    writer.write(element.toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> readFromFile(String path) {
        File file = new File(path);
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            line = reader.readLine();
            while ((line = reader.readLine()) != null && !line.equals("")) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //return về list String, ai gọi hàm sẽ xử lí phần xuất đối tượng
        return list;
    }
}
