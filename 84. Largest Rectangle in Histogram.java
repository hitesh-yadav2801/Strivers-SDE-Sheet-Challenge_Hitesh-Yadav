// Brute force

class Solution {
    public int largestRectangleArea(int[] arr) {
        int maxArea = 0;
        for(int i = 0; i < arr.length; i++){
            int left = i, right = i;
            while(left > 0 && arr[left - 1] >= arr[i]){
                left--;
            }
            while(right < arr.length - 1 && arr[right + 1] >= arr[i]){
                right++;
            }
            int area = (right - left + 1) * arr[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}

class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] ps = prevSmaller(arr, new int[n]);
        int[] ns = nextSmaller(arr, new int[n]);
        int maxArea = 0;
        for(int i = 0; i < n; i++){
            int area = (ns[i] - ps[i] - 1) * arr[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    static public int[] prevSmaller(int[] arr, int[] ans){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        ans[0] = -1;
        st.push(0);
        for(int i = 1; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
    static public int[] nextSmaller(int[] arr, int[] ans){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        ans[n - 1] = n;
        st.push(n - 1);
        for(int i = n - 2; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = n;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
