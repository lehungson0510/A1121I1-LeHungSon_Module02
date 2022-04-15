package on_thi.utils;

import java.util.Scanner;

public class Regex {
    static Scanner input = new Scanner(System.in);

    public static boolean costQuantity(double regex) {
        return regex > 0;
    }

    public static boolean warrantyTime(int regex) {
        return regex > 0 && regex <= 730;
    }

    public static boolean warrantySpace(String regex) {
        return regex.equals("Toan Quoc") || regex.equals("Quoc Te");
    }

    public static boolean nationHandGoods(String regex) {
        return !(regex.equals("Viet Nam"));
    }

    public static boolean status(String regex) {
        return regex.equals("Da sua chua") || regex.equals("Chua sua chua");
    }
}
