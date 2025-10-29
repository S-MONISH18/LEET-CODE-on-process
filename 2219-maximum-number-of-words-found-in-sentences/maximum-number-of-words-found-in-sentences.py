class Solution(object):
    def mostWordsFound(self, s):
        maxval=0
        em=[]
        for i in range(len(s)):
            em.append(s[i].split(" "))

            if len(em[i])>maxval:
                maxval=len(em[i])
        
        return maxval
        """
        :type sentences: List[str]
        :rtype: int
        """
        