import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> st) {
		if(st.isEmpty()){
			return;
		}
		int top = st.pop();
		sortStack(st);
		insert(st, top);
	}
	static void insert(Stack<Integer> st, int temp){
		if(st.isEmpty()){
			st.push(temp);
			return;
		}
		if(!st.isEmpty() && st.peek() <= temp){
			st.push(temp);
			return;
		}
		int cur = st.pop();
		insert(st, temp);
		st.push(cur);
	}
}
