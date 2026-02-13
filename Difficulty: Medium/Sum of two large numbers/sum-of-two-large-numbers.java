// User function Template for Java

class Solution {
    String findSum(String s1, String s2) {
        // code here
        int i = s1.length()-1;
        int j = s2.length()-1;
        int carry = 0;
        
        StringBuilder result = new StringBuilder();
        while(i>=0 || j >=0 || carry > 0){
            int d1 = (i>=0) ? s1.charAt(i) - '0': 0;
            int d2 = (j>=0) ? s2.charAt(j) - '0': 0;
            
            int sum = d1 + d2 + carry;
            result.append(sum % 10);
            carry = sum / 10;
            
            i--;
            j--;
        }
       String ans = result.reverse().toString();
       
        int k = 0;
        while (k < ans.length() - 1 && ans.charAt(k) == '0') {
            k++;
        }
        return ans.substring(k);
    }
}