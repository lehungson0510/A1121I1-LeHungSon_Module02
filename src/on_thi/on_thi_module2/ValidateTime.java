package on_thi_module2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ValidateTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập năm: ");
        String date = input.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false); /* để nếu sai ngày tháng thì nó sẽ xuất, true thì nó sẽ cộng ngày thừa lên tháng */
        try {
            Date date1 = format.parse(date);
            System.out.println(date.toString());
        } catch (ParseException e) {
            System.err.println("Nhập sai định dạng ngày tháng");
        }
    }
}
