class Solution(object):
    def uniqueOccurrences(self, arr):
        c=Counter(arr)
        s=set()
        for v in c.values():
            if v in s:
                return False
            else:
                s.add(v)
        return True
        """
        :type arr: List[int]
        :rtype: bool
        """
        