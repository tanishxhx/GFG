class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        result.add(arr[arr.length-1]);
        
        return result;
    }
}
