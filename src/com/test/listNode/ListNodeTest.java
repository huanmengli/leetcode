package com.test.listNode;

class ListNode{
    int val;
    ListNode next=null;
    ListNode(int x){
        this.val = x;
    }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ListNodeTest {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2=new ListNode(2,node1);
        ListNode node3=new ListNode(3,node2);
        System.out.println(node3.val);
    }
}
