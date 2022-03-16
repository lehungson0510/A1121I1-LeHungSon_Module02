package ss11_dsa_stack_queue.thuc_hanh.trien_khai_queue_sd_linkedlist;

import ss10_dsa_danh_sach.bai_tap.linked_list.MyLinkedList;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue(){
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key){
        Node temp = new Node(key);
        if(this.tail == null){
            this.head = this.tail = temp;
            return;
        }
        this.tail.next=temp;
        this.tail=temp;
    }

    public Node dequeue(){
        if(this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if(this.head == null) {
            this.tail = null;
        }
        return temp;
    }
}
