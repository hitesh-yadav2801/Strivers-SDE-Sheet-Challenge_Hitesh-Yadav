import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
		ArrayList<ArrayList<Long>> res = new ArrayList<>();

		ArrayList<Long> res0 = new ArrayList<>();
        res0.add(1l);
        res.add(res0);

		
		for(int i = 1; i < n; i++){
			ArrayList<Long> temp = new ArrayList<>();
			for(int j = 0; j <= i; j++){
				if(j == 0){
					temp.add(1l);
				} else if(j == i){
					temp.add(1l);
				} else {
					long num = res.get(i-1).get(j-1) + res.get(i-1).get(j);
					temp.add(num);
				}
			}
			res.add(temp);
		}
		return res;
	}
}
