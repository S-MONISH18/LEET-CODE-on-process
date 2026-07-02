class Solution(object):
    def findDuplicates(self, nums):
        mapset=set()
        res=[]
        for i in nums:
            if i not in mapset:
                mapset.add(i)
            else:
                res.append(i)

        return res
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        