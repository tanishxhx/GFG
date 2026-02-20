// User function Template for Java

class Solution {
    int findMaxAverage(int[] arr, int n, int k) {
        // code here
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        int maxSum = sum;
        int startIndex = 0;
        
        for(int i=k; i<n; i++){
            sum += arr[i];
            sum -= arr[i-k];
            
            if(sum > maxSum){
                maxSum = sum;
                startIndex = i-k+1;
            }
        }
        return startIndex;
    }
}
