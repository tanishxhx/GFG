class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        int n = arr.length;
        List<Integer> freq = new ArrayList<>(Collections.nCopies(n, 0));
        
        for (int num : arr) {
            freq.set(num - 1, freq.get(num - 1) + 1);
        }
        return freq;
    }
}
