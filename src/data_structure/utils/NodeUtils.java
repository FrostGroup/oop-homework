package data_structure.utils;

import data_structure.dynamic.Node;

public class NodeUtils {
    public static void addToTail(Node head, Node newNode) {
    }

    public static Node addToHead(Node head, Node newNode) {
        newNode.next = head;
        return newNode;
    }

    public static String toString(Node head) {

        StringBuilder sb = new StringBuilder();//
        Node iter = head;

        while (iter != null) {
            sb.append(iter.val + "->");
            iter = iter.next;
            /*int a = 0;
            a = a + 1;*/
        }

        return sb.toString();
    }

    public static String toStringR(Node head) {
        return head != null ?
                (head.val.toString() + "->" + toStringR(head.next)) : "";
    }

    public static Node createChain(int size) {
        Node head = new Node(0, null);
        Node last = head;
        for (int i = 1; i < size; i++) {
            last.next = new Node(i, null);
            last = last.next;
        }

        return head;
    }
}
