class Solution {
    public int climbStairs(int n) {
        
        int a,b,c=0;
        a=b=1;
        for(int i=0;i<n;i++)
        {
            c=a;
            a=a+b;
            b=c;

        }
        return c;
    }
}
