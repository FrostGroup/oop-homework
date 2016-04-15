package data_structure.dynamic;

import data_structure.common.MyIterator;
import data_structure.common.MyQueue;
import data_structure.common.Stack;
import data_structure.utils.NodeUtils;


public class MyQueueStack implements MyQueue, Stack {

    private Node head;
    private Node tail;
    private int position;

    @Override
    public MyIterator createIterator(){
        return new MyQueueStackIterator(head, tail);
    }

    @Override
    public void enqueue(Object obj) {

        if(head == null){
            head = new Node(obj,null);
        }
        else if(tail == null){
            tail = new Node(obj,head);
        }
        else{
            tail = new Node(obj, tail);
        }
    }

    @Override
    public Object dequeue() {

        if(head == null){
            return null;
        }

        Node temp = tail;

        while (temp.next != null && !temp.next.equals(head)){
            temp = temp.next;
        }
        head = temp;
        head.next = null;

        return temp;
    }

    @Override
    public String toString() {
        return "MyLinkedQueue{\n" +
                "tail: \n" + NodeUtils.toStringR(tail).replaceAll("->","\n") +
                '}';
    }
}
