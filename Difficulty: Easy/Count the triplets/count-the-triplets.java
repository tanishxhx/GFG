class Solution {
    int countTriplet(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        
        for(int k = n-1; k>=0; k--){
            int c = arr[k];
            int i=0;
            int j = k-1;
            
            while(i < j){
                int sum = arr[i] + arr[j];
                if(sum == c){
                    count++;
                    i++;
                    j--;
                } else if(sum < c){
                    i++;
                } else {
                    j--;
                }
            }
        }
        return count;
    }
}