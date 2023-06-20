import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int rem = s - arr[i];
            if(map.containsKey(rem)){
                int freq = map.get(rem);
                while(freq-- > 0){
                    if(rem < arr[i]){
                        list.add(new int[]{rem, arr[i]});
                    } else {
                        list.add(new int[]{arr[i], rem});
                    }
                }
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Collections.sort(list, Comparator.comparingInt(nums -> nums[0]));
        return list;
    }
}
