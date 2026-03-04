class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        int count[] = new int[n+1];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num: arr){
            count[num]++;
        }
        int repeating = -1;
        int missing = -1;
        for(int i=1; i<=n; i++){
            if(count[i] == 0){
                missing = i;
            }
            if(count[i] == 2){
                repeating = i;
            }
        }
        list.add(repeating);
        list.add(missing);
        return list;
    }
}
