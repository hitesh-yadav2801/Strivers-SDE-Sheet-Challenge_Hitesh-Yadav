import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        LinkedListNode<Integer> prev = null, cur = head;
		while(head != null){
			head = head.next;
			cur.next = prev;
			prev = cur;
			cur = head;
		}
		return prev;
    }
}
