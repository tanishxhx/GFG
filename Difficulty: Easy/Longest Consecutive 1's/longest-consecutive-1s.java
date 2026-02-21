class Solution {
    public static int maxConsecutiveOnes(int n) {
        // code here
        int count = 0;
        int maxCount = 0;
        
        while(n > 0){
            if((n & 1) == 1){
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
            }
            n >>= 1;
        }
        return maxCount;
    }
}
