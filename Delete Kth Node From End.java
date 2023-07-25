public class Solution
{
    public static Node removeKthNode(Node head, int k)
    {
        Node temp = head;
        while(--k > 0){
            temp = temp.next;
        }
        if(temp.next == null){
            return head.next;
        }
        Node dummy = head;
        Node prev = null;
        while(temp.next != null){
            temp = temp.next;
            prev = dummy;
            dummy = dummy.next;
        }
        prev.next = dummy.next;

        return head;
    }
}
