package exam_module2.ultis;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    Scanner input = new Scanner(System.in);

    public static boolean maBenhAn(String regex){
        String kiemTra = "^[B][A]-[\\d]{3}$";
        return Pattern.matches(kiemTra,regex);
    }

    public static boolean maBenhNhan(String regex){
        String kiemTra = "^[B][N]-[\\d]{3}$";
        return Pattern.matches(kiemTra,regex);
    }

}
