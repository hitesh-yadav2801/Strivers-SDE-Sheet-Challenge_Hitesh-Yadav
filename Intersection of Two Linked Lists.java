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
import java.util.*;
public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        Set<Node> set = new HashSet<>();
        Node temp = firstHead;
        while(temp != null){
            set.add(temp);
            temp = temp.next;
        }
        temp = secondHead;
        while(temp != null){
            if(set.contains(temp)){
                return temp.data;
            }
            temp = temp.next;
        }
        return -1;
    }
}
