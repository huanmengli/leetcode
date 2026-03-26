package com.test.listNode;

import java.util.List;

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
        System.out.println(node3.next.next.val);
//        ListNode node4 = new ListNode(1);
//        ListNode node5=new ListNode(2,node4);
//        ListNode node6=new ListNode(3,node5);
//        System.out.println(addTwoNumbers(node3,node6).val);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = null;
        ListNode nodeTrue=new ListNode(0);
        while (nodeTrue!=null){
            if (l1.next== null&& l2.next== null){
                break;
            }
            ListNode nodeTian=new ListNode(l1.val+l2.val);

        }
        return null;
    }
}
