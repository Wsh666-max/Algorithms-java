package com.atdefu005;

import java.util.jar.Manifest;

/**
 * ClassName: ListReverse
 * Package: com.atdefu005
 * Description:
 *
 * @Author 华因斯坦
 * @Create 2025/3/26 14:15
 * @Version 1.0
 */

//按值传递、按引用传递
//从堆栈的角度解释链表节点
//以堆栈的视角看链表的反转
public class ListReverse {
    public static void main(String[] args) {
        
    }


    //单链表（结构）
    public static class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //单链表反转
    public static ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    //双链表节点
    public static class DoubleListBode{
        public int value;
        public DoubleListBode last;
        public DoubleListBode next;

        public DoubleListBode(int value) {
            this.value = value;
        }
    }

    //反转双链表
    //没有找到测试链接
//    public static DoubleListBode

}
