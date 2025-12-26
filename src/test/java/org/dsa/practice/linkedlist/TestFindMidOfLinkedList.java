package org.dsa.practice.linkedlist;

import org.dsa.learn.linkedlist.FindMidOfLinkedList;
import org.dsa.learn.linkedlist.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFindMidOfLinkedList {
    @Test
    public void testFindMidOfLinkedList() {
        Node head = new Node(1,
                new Node(2,
                        new Node(3,
                                new Node(4,
                                        new Node(5,
                                                new Node(6))))));
        final var my_result = FindMidOfLinkedList.get(head);

        // Derive your solution here and replace the hard coded result
        int your_result = 3;

        Assertions.assertEquals(your_result, my_result.getVal());
    }
}
