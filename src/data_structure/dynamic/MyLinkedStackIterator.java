package data_structure.dynamic;


import data_structure.common.MyIterator;

public class MyLinkedStackIterator implements MyIterator {
    private Node top;
    private int position;

    public MyLinkedStackIterator(Node top){
        this.top = top;
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

}
