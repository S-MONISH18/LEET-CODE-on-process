class Solution:
    def findClosest(self, x, y, z): 
        d1, d2 = abs(x - z), abs(y - z)
        return 1 if d1 < d2 else 2 if d2 < d1 else 0
