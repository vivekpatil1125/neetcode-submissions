class Solution {
public:
    bool isPalindrome(string s) {
        int left=0,right=s.size()-1;
       transform(s.begin(), s.end(), s.begin(), ::tolower);
        while(left<right)
        {
            if(!isalnum(s[left]))
            {
                left++;                
            }
            else if(!isalnum(s[right]))
            {
                right--;
            }
            else if(s[left]==s[right])
            {
                left++;
                right--;
            }
            else
            {
                return false;
            }
        }

   

        return true;
    }
};
