class Solution {
    public int minCost(int[] heights, int[] cost) {
        // code here
        int n = heights.length;
        int towers[][] = new int[n][2];
        
        for (int i = 0; i < n; i++) {
         towers[i][0] = heights[i];
         towers[i][1] = cost[i];
        }
        
        Arrays.sort(towers, (a,b) -> Integer.compare(a[0], b[0]));
        
        long totalWeight = 0;
        for(int t[]: towers){
            totalWeight += t[1];
        }
        long cumulative = 0;
        int target = towers[0][0];
        for(int t[]: towers){
            cumulative += t[1];
            if(cumulative >= (totalWeight + 1)/2){
                target = t[0];
                break;
            }
        }
        long result = 0;
        for(int i=0; i<n; i++){
            result += (long)Math.abs(heights[i]-target) * cost[i];
        }
        return (int)result;
    }
}
