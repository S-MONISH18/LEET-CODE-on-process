class Solution(object):
    def smallestNumber(self, n):
        lent=bin(n)
        power=len(lent[2:])
        res=2**power
        if res>= n:
            return res-1
        # return lent
        """
        :type n: int
        :rtype: int
        """
        