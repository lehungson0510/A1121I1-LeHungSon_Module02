package ss10_dsa_danh_sach.bai_tap.linked_list;

import ss10_dsa_danh_sach.bai_tap.array_list.MyList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> listInteger = new MyLinkedList<Integer>();
        listInteger.addFirst(0);
        listInteger.add(1, 1);
        listInteger.add(2, 2);
        listInteger.add(3, 3);
        listInteger.addLast(5);
        listInteger.add(1);

        System.out.println("xuat mang: ");
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println(listInteger.get(i));
        }
        System.out.println("------------------");
        System.out.println("sau khi xoa: ");
        listInteger.remove(1);
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println(listInteger.get(i));
        }
        System.out.println("------------------------");
        System.out.println("Contains: " + listInteger.contains(3));
        System.out.println("IndexOf: " + listInteger.indexOf(4));
        System.out.println("First element: " + listInteger.getFirst());
        System.out.println("Last element: " + listInteger.getLast());
        System.out.println("booleanAdd: " + listInteger.add(1));

        System.out.println("------------------------");
        System.out.println("sau khi xoa mang");
        listInteger.clear();
        System.out.println("size= " + listInteger.size());
    }
}
