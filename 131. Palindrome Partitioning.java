class Solution {
    int n;
    public List<List<String>> partition(String s) {
        n = s.length();
        List<List<String>> ans = new ArrayList<>();
        solve(s, 0, ans, new ArrayList<>());
        return ans;
    }
    public void solve(String s, int idx, List<List<String>> ans, List<String> temp){
        if(idx >= n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx + 1; i <= n; i++){
            if(isPalindrome(s, idx, i - 1)){
                temp.add(s.substring(idx, i));
                solve(s, i, ans, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
    private boolean isPalindrome(String s, int i, int j){     
        while(i < j){
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}
