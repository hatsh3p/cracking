package LinkedLists;

import java.util.Arrays;

public class Node {
    int data;
    Node next = null;

    public Node (int data) {
        this.data = data;
    }

    void appendToTail(int data) {
        Node node = new Node(data);
        Node current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }


    public String toString() {
        Node current = this;
        StringBuilder strBuild = new StringBuilder();
        while (current != null) {
            strBuild.append(current.data);
            strBuild.append(" -> ");
            current = current.next;
        }
        strBuild.append("null");
        return strBuild.toString();
    }
}
