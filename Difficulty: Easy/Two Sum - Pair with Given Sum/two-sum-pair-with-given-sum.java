class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> seen = new HashSet<>();
        for(int num: arr){
            int diff = target - num;
            if(seen.contains(diff)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}