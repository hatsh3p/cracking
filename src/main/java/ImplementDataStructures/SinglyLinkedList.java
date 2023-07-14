package ImplementDataStructures;

import java.util.Objects;

public class SinglyLinkedList<T> {
    private SLLNode<T> head;
    private SLLNode<T> tail;
    private int size;

    /**
     * This implementation of singly linked list maintains a dummy head and a
     * regular tail.
     */
    public SinglyLinkedList() {
        head = new SLLNode<>();
        tail = null;
        size = 0;
    }

    public void addHead(T item) {
        SLLNode<T> newNode = new SLLNode<>(item);
        newNode.next = head.next;
        head.next = newNode;
        size++;
    }

    public void addTail(T item) {
        SLLNode<T> newNode = new SLLNode<>(item);
        SLLNode<T> current = head.next;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        tail = newNode;
        size++;
    }

    public void insert(T item, int pos) {
        if (pos > size) {
            throw new IndexOutOfBoundsException();
        }
        if (pos == 0) {
            addHead(item);
        } else if (pos == size) {
            addTail(item);
        }

        // Traverse list.
        SLLNode<T> node = new SLLNode<>(item);
        SLLNode<T> current = head.next;
        for (int i = 0; i < pos - 1; i++) {
           current = current.next; // Loop until you hit the node right before.
        }
        node.next = current.next;
        current.next = node;
        size++;
    }

    public T getItem(T item) {
        SLLNode<T> current = head.next;
        while (current != null) {
            if (current.data == item) {
                return item;
            }
            current = current.next;
        }
        return null;
    }

    public T getPosition(int pos) {
        if (pos >= size) {
            throw new IndexOutOfBoundsException();
        }
        SLLNode<T> current = head.next;
        for (int i = 0; i < pos - 1; i++) {
            current = current.next;
        }
        return current.next.data;
    }

    public T removeHead() {
        if (head.next != null) {
            T data = head.next.data;
            head.next = head.next.next; // Replace effective head.
            --size;
            return data;
        }
        return null;
    }

    public T removeTail() {
        if (head.next != null) {
            SLLNode<T> previous = null;
            SLLNode<T> current = head.next;
            if (current.next == null) {
                head.next = null;
                tail = null;
                return current.data;
            }
            while (current.next.next != null) {
                previous = current;
                current = current.next;
            }

            T data = current.next.data;
            tail = current;
            if (previous == null) {
                head.next = tail;
            }
            current.next = null;
            --size;
            return data;
        }
        return null;
    }
    public T delete(int pos) {
        if (pos >= size) {
            throw new IndexOutOfBoundsException();
        }
        SLLNode<T> current = head.next;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        // current is effectively the previous node.
        T data = current.next.data;
        current.next = current.next.next;
        --size;
        return data;
    }

    public T delete(T item) {
        SLLNode<T> current = head.next;
        while (current != null) {
            if (current.data == item) {
                return item;
            }
            current = current.next;
        }
        --size;
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("head -> ");
        SLLNode<T> current = head.next;
        while (current != null) {
            stringBuilder.append(current.data);
            if (current.next != null) {
                stringBuilder.append(" -> ");
            }
            current = current.next;
        }
        stringBuilder.append(" -> tail");
        return stringBuilder.toString();
    }

    public Object[] toArray() {
        Object[] arr = new Object[size];
        SLLNode<T> current = head.next;
        for (int i = 0; i < size; i++) {
            arr[i] = current.data;
            current = current.next;
        }
        return arr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinglyLinkedList<?> that = (SinglyLinkedList<?>) o;
        return size == that.size && Objects.equals(head, that.head) && Objects.equals(tail, that.tail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, tail, size);
    }
}
