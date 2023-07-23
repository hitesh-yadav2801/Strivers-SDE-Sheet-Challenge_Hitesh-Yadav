import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String s) 
    {
		Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
                maxLength = Math.max(right - left + 1, maxLength);
            } else {
                while(set.contains(ch)){
                    char c = s.charAt(left);
                    set.remove(c);
                    left++;
                }
                set.add(ch);
            }
        }
        return maxLength;
	}
}
