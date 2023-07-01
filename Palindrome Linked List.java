import java.util.* ;
import java.io.*; 

public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		if(head == null || head.next == null) return true;
		LinkedListNode<Integer> s = head, f = head;
		while(f != null && f.next != null){
			s = s.next;
			f = f.next.next;
		}
		LinkedListNode<Integer> mid = s;
		LinkedListNode<Integer> revHead = reverse(mid);
		while(revHead != null){
			if(!head.data.equals(revHead.data)){
				return false;
			}
			head = head.next;
			revHead = revHead.next;
		}
		return true;
	}
	private static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
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
