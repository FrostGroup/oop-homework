package data_structure.dynamic;

import data_structure.common.MyIterator;
import data_structure.common.MyQueue;
import data_structure.utils.NodeUtils;


public class MyQueueStack implements MyQueue, MyIterator {

    private Node head;
    private Node tail;
    private int position;

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

        while (temp.next != null && temp.next != head){
            temp = temp.next;
        }
        head = temp;
        head.next = null;

        return temp;
    }

    @Override
    public Object next() {
        if(position == 0){
            position++;
            return tail;
        }

        Node resNode = tail;

        for (int i = 0; i < position; i++) {
            resNode = resNode.next;
        }
        position++;
        return resNode;
    }

    @Override
    public boolean hasNext() {

        if(position == 0 && head.next != null){
            return true;
        }

        Node resNode = tail;

        for (int i = 0; i < position; i++) {
            resNode = resNode.next;
        }
        if (resNode != null) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "MyLinkedQueue{\n" +
                "tail: \n" + NodeUtils.toStringR(tail).replaceAll("->","\n") +
                '}';
    }
}
