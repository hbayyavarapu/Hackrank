package algorithms.linkedlist.singlelinkedlist;

/**
 * Created by Harish
 */
public class Node {
    public Node next;
    public Object data;

    Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(Object data) {
        this(data, null);
    }
}
