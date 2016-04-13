package test;


import data_structure.common.MyStack;
import data_structure.dynamic.MyLinkedStack;
import data_structure.dynamic.MyQueueStack;
import data_structure.dynamic.Node;

public class TestLinkedStack {
    public static void main(String[] args) {
        Node node = new Node(1,null);
        Node node2 = new Node(2,null);
        Node node3 = new Node(3,null);
        Node node4 = new Node(4,null);
        MyLinkedStack linked = new MyLinkedStack();
        linked.push(node);
        linked.push(node2);
        linked.push(node3);
        linked.push(node4);
        linked.pop();

        System.out.println(linked.toString());

        MyQueueStack queue = new MyQueueStack();
        queue.enqueue(node);
        queue.enqueue(node2);
        queue.enqueue(node3);
        queue.enqueue(node4);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println(queue.toString());




    }
}
