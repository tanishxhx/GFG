class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        for(int num: arr){
            if(num == k){
                return true;
            }
        }
        return false;
    }
}