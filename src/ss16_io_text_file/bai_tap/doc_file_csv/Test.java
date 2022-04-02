package ss16_io_text_file.bai_tap.doc_file_csv;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WriterReaderFileCsv wr = new WriterReaderFileCsv();
        System.out.println("Nhập file csv muốn ghi: ");
        String fileWrite = input.nextLine();

        List<Country> countries = new ArrayList<>();
        countries.add(new Country("1", "AU", "Australia"));
        countries.add(new Country("2", "CN", "China"));
        countries.add(new Country("3", "AU", "Australia"));
        countries.add(new Country("4", "CN", "China"));
        countries.add(new Country("5", "JP", "Japan"));
        countries.add(new Country("6", "CN", "China"));
        countries.add(new Country("7", "JP", "Japan"));
        countries.add(new Country("8", "TH", "Thailand"));
        wr.writeListCountry(fileWrite, countries);
        System.out.println("Ghi thành công");

        System.out.println("Nhập file csv muốn đọc: ");
        String fileRead = input.nextLine();
        List<Country> countryList = wr.readCountryFromFile(fileRead);
        System.out.println("\n--------------Kết quả------------\n");
        countryList.forEach(System.out::println);
    }
}
