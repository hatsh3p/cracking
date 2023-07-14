package ImplementDataStructures;

public class SLLNode<T> {
    protected T data;
    protected SLLNode<T> next;

    public SLLNode(T data) {
        this.data = data;
        next = null;
    }

    public SLLNode() {
        this(null);
    }
}
