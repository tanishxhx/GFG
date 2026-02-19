// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        int i=0;
        int j=0;
        int k=0;
        List<Integer> result = new ArrayList<>();
        while(i < arr1.size() && j < arr2.size() && k < arr3.size()){
           int a = arr1.get(i), b = arr2.get(j), c = arr3.get(k);
           if (a == b && b == c) {
                result.add(a);
                
                // Skip duplicates
                while(i < arr1.size() && arr1.get(i) == a){
                    i++;
                }
                while(j < arr2.size() && arr2.get(j) == b){
                    j++;
                }
                while(k < arr1.size() && arr3.get(k) == c){
                    k++;
                }
            }
            else if(a < b){
                i++;
            }
            else if(b < c){
                j++;
            }
            else{
                k++;
            }
        }
        if(result.isEmpty()){
            result.add(-1);
        }
        return result;
    }
}