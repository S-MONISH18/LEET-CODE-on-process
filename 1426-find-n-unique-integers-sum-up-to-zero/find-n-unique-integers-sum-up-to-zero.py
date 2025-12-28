class Solution(object):
    def sumZero(self, n):
        e=[]
        for i in range(1,(n/2)+1):
            e.append(-i)
            e.append(i)
        if n%2==0:
            return e
        else:
            e.append(0)
            return e
        """
        :type n: int
        :rtype: List[int]
        """
        