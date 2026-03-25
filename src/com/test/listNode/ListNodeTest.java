package com.test.listNode;

class ListNode{
    int val;
    ListNode next=null;
    ListNode(int x){
        this.val = x;
    }
}

public class ListNodeTest {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        System.out.println(node.next);
    }
}
