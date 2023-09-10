class Solution {
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[str.length - 1];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < Math.min(s1.length(), s2.length()); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return sb.toString();
            }
            sb.append(s2.charAt(i));
        }
        return sb.toString();
    }
}
