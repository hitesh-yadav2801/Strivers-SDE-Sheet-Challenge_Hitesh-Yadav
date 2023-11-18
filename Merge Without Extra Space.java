class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int left = n - 1, right = 0;
        while(left >= 0 && right < m){
            if(arr1[left] >arr2[right]){
                swap(arr1, arr2, left, right);
                left--;
                right++;
            } else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    static public void swap(long[] arr1, long[] arr2, int i, int j){
        long temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }
}
