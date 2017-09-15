package com.seed.leetcode.easy;

/**
 * Created by 若宇 on 2017/9/15.
 */
public class DeleteNodeInLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
