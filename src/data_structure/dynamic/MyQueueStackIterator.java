package data_structure.dynamic;


import data_structure.common.MyIterator;

public class MyQueueStackIterator implements MyIterator{
    private Node head;
    private Node tail;
    private int position;

    public MyQueueStackIterator(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
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
}
