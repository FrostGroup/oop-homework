package data_structure.static_str;


import data_structure.common.MyIterator;
import data_structure.common.MyQueue;
import data_structure.dynamic.Node;

public class MyArrayQueue implements MyQueue, MyIterator {

    private Object[] mas;
    private int top;
    private int position;

    public MyArrayQueue(int size) {
        mas = new Object[size];
    }

    @Override
    public void enqueue(Object obj) {

        if(top == mas.length){
            System.out.println("Stack is full");

        }else{
            mas[top] = obj;
            top ++;
        }
    }

    @Override
    public Object dequeue() {
        if(top == 0){
            return null;
        }

        Node resNode = (Node)mas[0];
        for (int i = 0; i < top ; i++) {
            mas[i] = mas[i + 1];
        }

        top --;
        return resNode;
    }

    @Override
    public Object next() {
        Node resNode = (Node)mas[position];
        position++;
        return resNode;
    }

    @Override
    public boolean hasNext() {
        if(position >= mas.length || mas[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = top - 1; i >= 0; i--) {
            sb.append(mas[i]).append("\n");
        }

        return "MyArrayQueue{\n" +
                sb +
                '}';
    }
}
