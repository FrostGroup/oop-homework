package data_structure.dynamic;

import data_structure.common.MyIterator;
import data_structure.common.MyStack;
import data_structure.utils.NodeUtils;


public class MyLinkedStack implements MyStack, MyIterator {

    private Node top;
    private int position;

    @Override
    public void push(Object obj) {

        if(top == null){
            top = new Node(obj, null);
        } else {
            Node newNode = new Node(obj,top);
            top = newNode;
        }
    }

    @Override
    public Object pop() {

        if(top == null){
            System.out.println("Stack is empty");
            return null;
        }

        Object forRet = top.val;
        top = top.next;
        return forRet;
    }

    @Override
    public Object next() {

        if(position == 0){
            position++;
            return top;
        }

        Node resNode = top;

        for (int i = 0; i < position; i++) {
            resNode = resNode.next;
        }
        position++;
        return resNode;
    }

    @Override
    public boolean hasNext() {

        if(position == 0 && top.next != null){
            return true;
        }

        Node resNode = top;

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

        return "MyLinkedStack{\n" +
                "top: \n" + NodeUtils.toStringR(top).replaceAll("->","\n") +
                '}';
    }
}
