package algorithms.linkedlist.singlelinkedlist;

/**
 * Created by Harish
 */

public class SList {
    public int size;
    public Node head;
    public Node tail;

    public SList() {
        head = null;
        tail = head;
        size = 0;
    }

    public int length() {
        return size;
    }

    public void addFront(Object data) {
        head = new Node(data, head);
        tail = head;
        if(size > 0) {
            while (tail.next != null) {
                tail = tail.next;
            }
        }
        size++ ;
    }

    public void insertEnd(Object data) {
        if(head == null) {
            head = new Node(data);
            tail = head;
        } else {
            Node node = new Node(data);
            tail.next = node;
            tail = node;
        }

        size++;

    }

    public void insertNth(Object data, int position) {

        if(position < 1 ) {
            System.out.println("Enter a right value");
        } else if(position == 1 ) {
            addFront(data);
        } else {
            Node curr = head;
            for(int i = 1; i < position - 1; i++) {
                curr = curr.next;
            }
            Node node = new Node(data);
            node.next = curr.next;
            curr.next = node;
            size++;
        }
    }

    public void deleteNth(int position) {
        if(position <= 0) {
            System.out.println("Enter right value");
        } else if(position == 1) {
            head = head.next;
        } else {
            Node curr = head;
            for(int i = 1; i < position -1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            size--;
        }
    }

    public String toString() {
        System.out.println();
        Object obj;
        String result = "[  ";

        Node cur = head;

        while (cur != null) {
            obj = cur.data;
            result = result + obj.toString() + "  ";
            cur = cur.next;
        }
        result = result + "]";
        return result;
    }

    public static void main(String[] args) {
        SList slist  = new SList();
        slist.addFront(10);
        slist.addFront(3);
        slist.insertEnd(6);
        slist.insertEnd(5);
        slist.addFront(2);
        slist.insertEnd(9);
        System.out.println("Before nth Linked List: " + slist.toString());
        slist.insertNth(1, 1);
        slist.insertNth(7, 2);
        System.out.println("After nth Linked List: " + slist.toString());
        slist.deleteNth(3);
        System.out.println("After deletion:  " + slist.toString());
        System.out.println("length: " + slist.length());
    }

}
