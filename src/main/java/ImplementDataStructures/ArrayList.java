package ImplementDataStructures;

public class ArrayList<T> {
    private T[] arr;
    private int size;
    private int capacity;
    private final static int DEFAULT_SIZE = 10; // Must be static.
    // Constructor
    public ArrayList(int capacity) {
        // Looks funky b/c you can't make a T array. Need to make an Object array.
        // And cast it to T[].
        // Will generate warning but safe to ignore in this case.
        arr = (T[]) new Object[capacity];
        size = 0;
    }
    public ArrayList() {
        this(DEFAULT_SIZE);
    }

    public int length() {
        return capacity;
    }

    public T get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    public void add(T item) {
        if (size == capacity) {
            resizeArr();
        }
        arr[size] = item;
        size++;
    }

    private void resizeArr() {
        // Update the capacity.
        capacity *= 2;

        // Create a new array that is double the size.
        T[] newArr = (T[]) new Object[capacity];

        // Copy the old array to the new array.
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        // Update reference.
        arr = newArr;
    }

    // Insert
    public void add(int index, T item) {

    }

    public T remove(int index) {
        return null;
    }



}
