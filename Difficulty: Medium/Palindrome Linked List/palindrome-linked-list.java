/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        if(head == null || head.next == null){
            return true;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node midNode = slow;
        
        Node prev = null;
        Node current = midNode;
        Node next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node rightHalf = prev;
        Node leftHalf = head;
        boolean isPalindrome = true;
        while(rightHalf != null){
            if(rightHalf.data != leftHalf.data){
                isPalindrome = false;
                break;
            }
            leftHalf = leftHalf.next;
            rightHalf = rightHalf.next;
        }
        current = prev;
        Node restorePrev = null;
        while(current != null){
            Node tempnext = current.next;
            current.next = restorePrev;
            restorePrev = current;
            current = tempnext;
        }
        return isPalindrome;
    }
}