class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();

        Arrays.stream(word1)
            .forEach(x->sb1.append(x));
        Arrays.stream(word2)
            .forEach(x->sb2.append(x));
        //System.out.println(sb1.toString());
        //System.out.println(sb2.toString());
        return sb1.toString().equals(sb2.toString());
    }
}