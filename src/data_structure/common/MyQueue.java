package data_structure.common;


public interface MyQueue extends MyIterator{

    // add to tail
    void enqueue(Object obj);

    // remove from head
    Object dequeue();

}
