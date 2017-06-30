package algorithms.sorting;

import algorithms.linkedlist.Node;
import algorithms.linkedlist.SList;

/**
 * Created by Harish on 6/27/17.
 */

public class QSortSList {
    public static void main(String[] args) {

        SList slist = new SList();
        slist.addFront(10);
        slist.addFront(3);
        slist.insertEnd(6);
        slist.insertEnd(5);
        slist.addFront(2);
        slist.insertEnd(9);
        slist.insertNth(1, 4);
        slist.insertNth(7, 2);

        partition(slist);

    }

    public static void partition(SList slist) {
        Node pivot = slist.tail;
        Node head = slist.head;

        while(head.next != null) {
//            if(head.data.pivot.data) {
//
//            }
        }

    }
}
