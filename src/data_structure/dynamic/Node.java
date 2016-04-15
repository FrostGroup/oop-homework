package data_structure.dynamic;


public class Node implements Cloneable{


    public Object val;
    public Node next;
    public Node previous;


    public Node() {
    }

    public Node(Object val, Node next) {
        this.val = val;
        this.next = next;
    }

    public Node(Object val, Node next, Node previous){
        this.val = val;
        this.next = next;
        this.previous = previous;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        return  val != null ? !val.equals(node.val) : node.val != null;

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return val.toString();
    }
}
