package algorithms.linkedlist;

/**
 * Created by Harish on 6/27/17.
 */
public class Node {
    Node next;
    Object data;

    Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(Object data) {
        this(data, null);
    }
}
