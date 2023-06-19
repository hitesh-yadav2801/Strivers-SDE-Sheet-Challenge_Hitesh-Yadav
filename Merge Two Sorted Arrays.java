// using extra space 

import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int len = Math.abs(arr1.length - n);
        int[] temp = new int[len];
        System.arraycopy(arr1, 0, temp, 0, len);
        int x = 0, y = 0, i = 0;
        while(x < m && y < n){
            if(temp[x] < arr2[y]){
                arr1[i++] = temp[x++];
            } else {
                arr1[i++] = arr2[y++];
            }
        }
        while(x < m){
            arr1[i++] = temp[x++];
        }
        while(y < n){
            arr1[i++] = arr2[y++];
        }
        return arr1;
    }
}

// Optimal without space

import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int i = m + n - 1, x = m - 1, y = n - 1;
        while(x >= 0 && y >= 0){
            if(arr1[x] > arr2[y]){
                arr1[i--] = arr1[x--];
            } else {
                arr1[i--] = arr2[y--];
            }
        }
        while(y >= 0){
            arr1[i--] = arr2[y--];
        }
        return arr1;
    }
}

