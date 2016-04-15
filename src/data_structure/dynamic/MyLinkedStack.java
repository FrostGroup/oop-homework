package data_structure.dynamic;

import data_structure.common.MyIterator;
import data_structure.common.MyStack;
import data_structure.common.Stack;
import data_structure.utils.NodeUtils;


public class MyLinkedStack implements MyStack, Stack {

    private Node top;

    @Override
    public MyIterator createIterator(){
        return new MyLinkedStackIterator(top);
    }

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
    public String toString() {

        return "MyLinkedStack{\n" +
                "top: \n" + NodeUtils.toStringR(top).replaceAll("->","\n") +
                '}';
    }
}
