package data_structure.static_str;

import data_structure.common.MyIterator;
import data_structure.dynamic.Node;


public class MyArrayQueueIterator implements MyIterator {

    private Object[] mas;
    private int position;

    public MyArrayQueueIterator(Object[] mas){
        this.mas = mas;
    }

    public MyArrayQueueIterator(int size) {
        mas = new Object[size];
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
}


