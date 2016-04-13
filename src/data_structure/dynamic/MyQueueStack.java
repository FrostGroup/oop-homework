package data_structure.dynamic;

import data_structure.common.MyQueue;
import data_structure.common.MyStack;
import data_structure.utils.NodeUtils;


public class MyQueueStack implements MyQueue {

    private Node top;
    private int size;

    @Override
    public void enqueue(Object obj) {

        if(top == null){
            top = new Node(obj,null);
            size++;

        }else{
            top = new Node(obj,top);
            size++;
        }
    }

    @Override
    public Object dequeue() {

        if(top == null){
            return null;
        }

        if(top.next == null){
            Node resNode = top;
            top = null;
            return resNode;
        }

        Node temp = top;
        for (int i = 0; i < size - 2; i++) {
           temp = temp.next;
        }

        Node resNode = temp.next;
        temp.next = null;
        size --;

        return resNode;
    }

    @Override
    public String toString() {
        return "MyQueueStack{\n" +
                "top: \n" + NodeUtils.toStringR(top).replaceAll("->","\n") +
                '}';
    }
}
