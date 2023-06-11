import java.io.*;
import java.util.* ;

public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        long res = 1;
        long xx = x;
        while(n > 0){
            if(n % 2 == 1){
                res = ((res)%m * (xx)%m) % m;
                n--;
            }
            xx = ((xx)%m * (xx)%m) % m;
            n /= 2;
        }    
        return (int)res;    
    }
}
