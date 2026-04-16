class Solution(object):
    def maximumValue(self, strs):
        # def maximumValue(strs):
        return max(int(s) if s.isdigit() else len(s) for s in strs)