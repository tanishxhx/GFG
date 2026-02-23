class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int first = firstOccurence(arr, target);
        if(first == -1){
            return 0;
        }
        int last = lastOccurence(arr, target);
        return last-first+1;
    }
    public int firstOccurence(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        int result = -1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                result = mid;
                high = mid-1;
            } else if(arr[mid] < target){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return result;
    }
    public int lastOccurence(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        int result = -1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                result = mid;
                low = mid+1;
            } else if(arr[mid] < target){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return result;
    }
}
