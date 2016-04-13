package data_structure.static_str;

import data_structure.common.MyStack ;


public class MyArrayStack implements MyStack {

    private Object[] mas;
    private int top;

    public MyArrayStack(int size) {
        mas = new Object[size];
    }

    @Override
    public void push(Object obj) {
        if(top == mas.length){
            System.out.println("Stack is full");
            return;
        }
        mas[top++] = obj;
    }

    @Override
    public Object pop() {
        Object forRet = mas[--top];
        mas[top] = null;
        return forRet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = top - 1; i > 0; i--) {
            sb.append(mas[i]).append("\n");
        }

        return "MyArrayStack{\n" +
                sb +
                '}';
    }
}
