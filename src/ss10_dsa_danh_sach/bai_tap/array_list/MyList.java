package ss10_dsa_danh_sach.bai_tap.array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    //Thêm phần tử tại index
    public void add(int index, E element) {
        if (index < 0 || index > elements.length - 1) {
            throw new IndexOutOfBoundsException("index: " + index + " length: " + elements.length);
        }
        if (elements.length == size) {
            ensureCapacity(3);
        }
        if (this.elements[index] != null) {
            for (int i = size; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
        }
        elements[index] = element;
        size++;
    }

    //    Xoá phần tử tại index
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("index: " + index + "length: " + elements.length);
        }
        E elementRemove = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        return elementRemove;
    }

    //    Lấy size
    public int getSize() {
        return size;
    }

    //    Sao chép
    public MyList<E> clone() {
        MyList<E> cloneList = new MyList<>();
        cloneList.elements = Arrays.copyOf(this.elements, this.size);
        cloneList.size = this.size;
        return cloneList;
    }

    //    Kiểm tra phần tử coi có tồn tại không
    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    //    Xuất index
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }


    public boolean add(E e) {
        if (size == elements.length) {
            return false;
        } else {
            elements[size] = e;
            size++;
            return true;
        }
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity + elements.length);
    }

    //    Trả về phần tử tại i
    public E get(int i) {
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}

