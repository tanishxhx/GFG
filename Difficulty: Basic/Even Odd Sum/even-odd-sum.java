// User function Template for Java

class Solution {
    ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
        // code here
        int oddSum = 0;
        int evenSum = 0;
        for(int i=0; i<N; i++){
            if((i+1) % 2 == 1){
                oddSum += Arr[i];
            } else {
                evenSum += Arr[i];
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(oddSum);
        result.add(evenSum);
        
        return result;
    }
}