// Brute force
class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int product = 1;
            for(int j = i; j < nums.length; j++){
                product = product * nums[j];
                max = Math.max(max, product);
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}

// Optimal sol

class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int curProd = 1;
        int n = nums.length;
        for(int i = 0; i < n; i++){
           curProd *= nums[i];
           max = Math.max(max, curProd);
           if(curProd == 0){
               curProd = 1;
           }
        }
        curProd = 1;
        for(int i = n - 1; i >= 0; i--){
            curProd *= nums[i];
            max = Math.max(max, curProd);
            if(curProd == 0){
                curProd = 1;
            }
        }
        return max;
    }
}
