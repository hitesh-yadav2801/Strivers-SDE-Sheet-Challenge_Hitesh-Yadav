class Solution {
    int median(int matrix[][], int R, int C) {
       int start = 1;
       int end = 2000;
       int n = R * C;
       int medianIndex = n / 2;
       while(start <= end){
           int assumedMedian = start + (end - start) / 2;
           
           int smallerElements = findSmallerElements(matrix, assumedMedian);
           if(smallerElements <= medianIndex){
               start = assumedMedian + 1;
           } else {
               end = assumedMedian - 1;
           }
       }
       return start;
    }
    int findSmallerElements(int[][] matrix, int assumedMedian){
        int noOfElements = 0;
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            int start = 0;
            int end = matrix[i].length - 1;
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(matrix[i][mid] <= assumedMedian){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            noOfElements += start;
            
        }
        return noOfElements;
    }
}
