class Solution(object):
    def commonFactors(self, a, b):
        minval=min(a,b)
        co=0
        for i in range(1,minval+1):
            if a%i==0 and b%i==0:
                co+=1
        return co
        """
        :type a: int
        :type b: int
        :rtype: int
        """
        