package data_structure.dynamic;

import data_structure.common.MyIterator;
import data_structure.common.MyQueue;
import data_structure.common.MyStack;


public class Stack {
    private MyQueue queue;
    private MyStack stack;

    public Stack(MyStack stack, MyQueue queue) {
        this.stack = stack;
        this.queue = queue;
    }

    public void showStack(){
        System.out.println("queue\n");
        showStack(queue);
        System.out.println("stack\n");
        showStack(stack);
    }

    private void showStack(MyIterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
