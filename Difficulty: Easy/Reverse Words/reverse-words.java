class Solution {
    public String reverseWords(String s) {
        // Code here
        //Split the String by dots
        String splittedString[] = s.split("\\.");
        //Collect non-empty words
        List<String> list = new ArrayList<>();
        for(String word: splittedString){
            if(!word.isEmpty()){
                list.add(word);
            }
        }
        //Reverse and join by dots
        Collections.reverse(list);
        
        return String.join(".", list);
    }
}
