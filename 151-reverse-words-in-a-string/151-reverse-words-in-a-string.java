class Solution {
    public String reverseWords(String s) 
    {
    Scanner parts = new Scanner(s);
    
    String result = "";
    
    while(parts.hasNext()){
        result = parts.next() + " " + result;
    }
    
    return result.trim();
    }
}