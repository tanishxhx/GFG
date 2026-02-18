// User function Template for Java

class Solution {
    public String makeEven(String s) {
        // code here.
        char arr[] = s.toCharArray();
        int n = arr.length;
        char last = arr[n-1];
        int swapIndex = -1;
        
        for(int i=0; i<n-1; i++){
            if((arr[i] - '0') % 2 == 0){
                swapIndex = i;
                if(arr[i] < last){
                    break;
                }
            }
        }
        if(swapIndex == -1){
            return s;
        }
        char temp = arr[swapIndex];
        arr[swapIndex] = arr[n-1];
        arr[n-1] = temp;
        
        return new String(arr);
    }
}