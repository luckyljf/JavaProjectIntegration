package com.ljf.linked;

/**
 * @author ljf
 * @date 2022/10/25 23:32
 * @Description
 */
public class MyLinkedList {
    private int size;

    private ListNode head;


    public MyLinkedList() {
        this.size = 0;
        this.head = new ListNode(-1);
    }


    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(0,10);
        myLinkedList.add(1,100);
        myLinkedList.add(2,1000);
        myLinkedList.add(3,10000);
        System.out.println(myLinkedList);
        ListNode listNode = myLinkedList.flip(myLinkedList.head);
        System.out.println(listNode);

    }

    /**
     * 链表翻转
     * @param head
     * @return
     */
    private ListNode flip(ListNode head) {

        ListNode prev = null;
        ListNode cur = head;
        ListNode tmp = null;

        while (cur != null){
            tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        return prev;
    }

    /**
     * 链表添加元素
     * @param index
     * @param value
     */
    private void add(int index, int value) {

        if (index > size){
            return;
        }

        if (index < 0){
            index = 0;
        }

        ListNode prev = head;

        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        ListNode toAdd = new ListNode(value);


        toAdd.next = prev.next;
        prev.next = toAdd;
        size++;
    }


}
