class Solution:
    def countElements(self, nums: List[int]) -> int:
        if len(set(nums)) == 1:
            return 0
        minn = min(nums)
        maxx = max(nums)

        return len(nums) - (nums.count(minn) + nums.count(maxx))