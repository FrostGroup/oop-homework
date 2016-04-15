package test;


import data_structure.dynamic.MyLinkedStack;
import data_structure.dynamic.MyQueueStack;
import data_structure.dynamic.Node;
import data_structure.common.Stack;
import data_structure.static_str.MyArrayQueue;
import data_structure.static_str.MyArrayStack;

public class TestStack {
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

        System.out.println(queue.toString());

        MyArrayQueue arrayQueue = new MyArrayQueue(5);

        arrayQueue.enqueue(node);
        arrayQueue.enqueue(node2);
        arrayQueue.enqueue(node3);
        arrayQueue.enqueue(node4);

        arrayQueue.dequeue();
        arrayQueue.dequeue();

        System.out.println(arrayQueue.toString());

        MyArrayStack arrayStack = new MyArrayStack(5);
        arrayStack.push(node);
        arrayStack.push(node2);
        arrayStack.push(node3);
        arrayStack.push(node4);

        Stack stack = new Stack(arrayStack,queue);
        stack.showStack();

        System.out.println();
        System.out.println(node.equals(node3));

    }
}
