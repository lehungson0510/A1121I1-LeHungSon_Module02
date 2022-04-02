package ss16_io_text_file.bai_tap.doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriterReaderFileCsv {
    final String SEPARATION = ",";

    public void writeListCountry(String path, List<Country> countries) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write("ID" + SEPARATION + "CODE" + SEPARATION + "NAME");
            for (Country country : countries) {
                writer.newLine();
                writer.write(country.getId() + SEPARATION + country.getCode() + SEPARATION + country.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Country> readCountryFromFile(String path) {
        List<Country> countries = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null; // bỏ qua dòng đầu tiên (cái tiêu đề của excel)
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(SEPARATION);
                String id = values[0];
                String code = values[1];
                String name = values[2];
                countries.add(new Country(id, code, name));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return countries;
    }
}
