public class Solution {
    public static Node rotate(Node head, int k) {
        if (head == null || head.next == null) return head;
        Node temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        k = k % size;
        if (k == 0) return head;
        while(k-- > 0){
            temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            Node tail = temp.next;
            tail.next = head;
            temp.next = null;
            head = tail;
        }
        return head;
    }
}
