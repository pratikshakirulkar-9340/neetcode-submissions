class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder original =new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                original.append(Character.toLowerCase(ch));
            }
        }
            StringBuilder reversed =new StringBuilder(original);
            reversed.reverse();
         
        
         return original.toString().equals(reversed.toString());
    }
}