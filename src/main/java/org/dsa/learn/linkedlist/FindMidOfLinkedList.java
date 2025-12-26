package org.dsa.learn.linkedlist;

public class FindMidOfLinkedList {
    public static Node get(Node head) {
        if(head == null)
            return null;

        Node sp = head; Node fp = head;
        while (fp != null && fp.nextNode != null) {
            fp = fp.nextNode.nextNode;
            sp = sp.nextNode;
        }
        return sp;
    }
}
