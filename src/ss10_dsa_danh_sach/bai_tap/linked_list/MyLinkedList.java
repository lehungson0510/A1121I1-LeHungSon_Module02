package ss10_dsa_danh_sach.bai_tap.linked_list;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    private class Node {
        private Node next;
        Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList() {
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    //    Them phan tu vao dau
    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    //    Them phan tu vao cuoi
    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        //hiện tại temp đang ở vị trí cuối của liên kết
        temp.next = new Node(e);
        numNodes++;
    }

    // Xuat phan tu
    public E get(int index) {
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    // Số phần tử trong danh sách
    public int size() {
        return this.numNodes;
    }

    //Xoá phần tử ở vị trí bất kì
    public E remove(int index) {
        Object data;
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("ERROR index: " + index);
        } else {
            Node temp = this.head;
            if (index == 0) {
                data = temp.data;
                this.head = head.next;
            } else {
                for (int i = 0; i < index - 1 && temp.next != null; i++) {
                    temp = temp.next;
                }
                data = temp.next;
                temp.next = temp.next.next;
            }
            numNodes--;
        }
        return (E) data;
    }

    //Xoá phần tử muốn xoá trong liên kết
    public boolean remove(E element) {
        if (this.head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            Node temp = this.head;
            while (temp.next != null) {
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        return false;
    }

    // Sao chép LinkedList
    public MyLinkedList<E> clone() {
        if (numNodes == 0) {
            throw new NullPointerException("LinkedList không có phần tử");
        }
        MyLinkedList<E> myLinkedListClone = new MyLinkedList<>();
        Node temp = this.head;
        myLinkedListClone.addFirst((E) temp.data);

        temp = temp.next;
        while (temp != null) {
            myLinkedListClone.addLast((E) temp.data);
            temp = temp.next;
        }
        return myLinkedListClone;
    }

    // Kiểm tra phần tử trong danh sach
    public boolean contains(E element) {
        Node temp = this.head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Trả về index của phần tử
    public int indexOf(E element) {
        Node temp = this.head;
        int i = 0;
        while (temp.next != null) {
            if (temp.getData().equals(element)) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Add thêm phần tử, trả về true neu add duoc
    public boolean add(E element) {
        //chạy lại liên kết xem có phần tử đó ở cuối không
        if (element == null) {

            return false;
        } else {
            this.addLast(element);
            return true;
        }
    }

    // Lấy đầu liên kết
    public E getFirst() {
        return (E) this.head.data;
    }

    // Lấy cuối liên kết
    public E getLast() {
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    // Xoá hết
    public void clear() {
        this.numNodes = 0;
        this.head = null;
    }

}
