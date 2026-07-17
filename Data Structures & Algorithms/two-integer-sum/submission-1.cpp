class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> temp;

        for(int i=0;i<nums.size();i++)
        {
            int compliment=target-nums[i];
            if(temp.contains(compliment)==true)
            {
                return {temp[compliment],i};
            }
            temp[nums[i]]=i;
        }
        return {};
    }
};
