// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        if(n <= 0 ){
            return new int[0];
        }
        if(n == 1){
            return new int[]{0};
        }
        int fib[] = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib;
    }
}