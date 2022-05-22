class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> st=new Stack<Character>();
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(ch=='(' || ch=='{' || ch=='[')
            {
                st.push(ch);
            }
            else
            {
                char ck=' ';
                if(!st.empty())
                {
                    ck=st.peek();
                }
                if(ch==')' && ck=='(')
                {
                    st.pop();
                }
                else if(ch=='}'&& ck=='{')
                {
                    st.pop();
                }
                else if(ch==']' && ck=='[')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(st.empty())
        {
            return true;
        }
        return false;
    }
}