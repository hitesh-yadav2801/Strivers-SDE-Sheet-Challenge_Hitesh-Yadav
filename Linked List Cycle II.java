/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {
    public static Node firstNode(Node head) {
        Node slow = head; 
        Node fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
           if(slow == fast){
               flag = true;
               break;
           }
        }
        if(flag){
            Node temp = head;
            while(temp != slow){
                temp = temp.next;
                slow = slow.next;
            }
            return temp;
        }
        return null;
    }
}
