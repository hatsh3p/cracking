package StacksAndQueues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;

public class Stack<T> {
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data){
            this.data = data;
        }
    }

    private StackNode<T> top;

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        StackNode<T> node = new StackNode<>(item);
        node.next = top;
        top = node;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public String toString(){
        if (this.isEmpty()) { return ""; }
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("TOP -> ");
        ArrayList<T> temp = new ArrayList<>();
        while (this.top != null) {
            T item = this.pop();
            strBuilder.append(item);
            strBuilder.append(" -> ");
            temp.add(item);
        }
        strBuilder.append("BOTTOM");
        Collections.reverse(temp);
        Stack<T> recreateStack = new Stack<>();
        for (T item: temp) {
            recreateStack.push(item);
        }
        this.top = recreateStack.top;
        return strBuilder.toString();
    }
}
