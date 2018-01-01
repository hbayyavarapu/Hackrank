package algorithms.linkedlist.doublelinkedlist;

public class DNode {
    private Object data;
    private DNode left;
    private DNode right;

    public DNode(Object data, DNode left, DNode right) {
        this.data = data;
        this.left = left;
        this.right = right;

    }

    public DNode(Object data) {
        this(data, null, null);
    }
}
