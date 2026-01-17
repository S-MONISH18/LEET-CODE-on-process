class Solution(object):
    def busyStudent(self, startTime, endTime, queryTime):
        # count=0
        res=0
        for i in range(len(startTime)):
            if  startTime[i]<= queryTime<= endTime[i]:
                res+=1

        return res  
        """
        :type startTime: List[int]
        :type endTime: List[int]
        :type queryTime: int
        :rtype: int
        """
        