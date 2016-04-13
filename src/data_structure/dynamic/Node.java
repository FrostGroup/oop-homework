package data_structure.dynamic;


public class Node {


    public Object val;
    public Node next;

    public Node() {
    }

    public Node(Object val, Node next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return val.toString();
    }
}
