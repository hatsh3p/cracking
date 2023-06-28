package StacksAndQueues;

import javax.management.QueryEval;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Queue<T> {
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }
    }
    private QueueNode<T> first;
    private QueueNode<T> last;

    public void add(T item) {
        QueueNode<T> t = new QueueNode<T>(item);
        if (last != null) {
            last.next = t;
        }
        last = t;
        if (first == null) {
            first = last;
        }
    }

    public T remove() {
        if (first == null) throw new NoSuchElementException();
        T data = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return data;
    }

    public T peek() {
        if (first == null) throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public String toString() {
        if (this.isEmpty()) { return ""; }
        StringBuilder strBuilder = new StringBuilder();
        ArrayList<T> temp = new ArrayList<>();
        strBuilder.append("FRONT -> ");
        while (this.first != null) {
            T item = this.remove();
            strBuilder.append(item);
            strBuilder.append(" -> ");
            temp.add(item);
        }
        strBuilder.append("BACK");
        Queue<T> recreateQueue = new Queue<>();
        for (T item: temp) {
            recreateQueue.add(item);
        }
        this.first = recreateQueue.first;
        this.last = recreateQueue.last;
        return strBuilder.toString();
    }
}
