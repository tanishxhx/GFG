class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int low = 1;
        int high = 0;
        for(int pile: arr){
            high = Math.max(pile, high);
        }
        int result = high;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(canEat(arr, k, mid)){
                result = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return result;
    }
    public boolean canEat(int arr[], int k, int speed){
        long hours = 0;
        for (int p : arr) {
            hours += (p + speed - 1) / speed;
        }
        return hours<=k;
    }
}
