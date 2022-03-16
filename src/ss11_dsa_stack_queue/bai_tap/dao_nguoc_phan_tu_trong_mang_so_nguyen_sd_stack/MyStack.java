package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_sd_stack;

import java.util.ArrayList;

public class MyStack <T>{
    private ArrayList<T> stack;
    private int[] arr;

    public MyStack(){
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }
}

