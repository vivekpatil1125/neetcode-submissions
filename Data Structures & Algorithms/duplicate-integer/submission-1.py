class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        done=set()

        for num in nums:
            if num in done:
                return True
            done.add(num)
        return False

        