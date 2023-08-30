class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];
        st.push(nums2[n-1]);
        map.put(nums2[n-1], -1);
        int i = n - 2;
        while(i >= 0 && !st.isEmpty()){
            int cur = nums2[i];
            while(!st.isEmpty() && st.peek() < cur){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(cur, -1);
            } else {
                map.put(cur, st.peek());
            }
            st.push(cur);
            i--;
        }
        i = 0;
        for(int num : nums1){
            ans[i++] = map.get(num);
        }
        return ans;
    }
}
