package org.dsa.learn.linkedlist;

public class Node {
    private final int val;
    Node nextNode;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node node) {
        this.nextNode = node;
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
