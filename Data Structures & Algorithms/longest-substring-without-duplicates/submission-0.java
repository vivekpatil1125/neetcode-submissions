class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max=0;
        char[] a=s.toCharArray();
        
        for(int i=0;i<s.length();i++)
        {
            HashSet<Character> seen = new HashSet<>();
            int count=0;
            for(int j=i;j<s.length();j++) 
            {
                if(seen.contains(a[j]))
                    break;

                seen.add(a[j]);
                count++;
            
                if(count > max) 
                    max=count;
                
            }

        }
        return max;
    }
}
