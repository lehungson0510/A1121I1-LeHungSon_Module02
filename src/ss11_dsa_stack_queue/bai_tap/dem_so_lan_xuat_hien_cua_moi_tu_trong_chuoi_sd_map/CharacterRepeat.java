package ss11_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trong_chuoi_sd_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterRepeat {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String string = input.nextLine();
        String[] stringArr = string.toLowerCase().split("");
        for (String key : stringArr) {
            if (map.containsKey(key)) {
                int value = map.get(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }
        System.out.print("So lan xuat hien cac ki tu: " + map);
    }
}
