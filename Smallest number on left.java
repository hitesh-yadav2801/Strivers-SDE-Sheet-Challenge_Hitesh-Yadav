//User function Template for Java
class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(a[0]);
        list.add(-1);
        
        for(int i = 1; i < n; i++){
            int cur = a[i];
            while(!st.isEmpty() && st.peek() >= cur){
                st.pop();
            }
            if(st.isEmpty()){
                list.add(-1);
            } else {
                list.add(st.peek());
            }
            st.push(cur);
        }
        return list;
    }
}
