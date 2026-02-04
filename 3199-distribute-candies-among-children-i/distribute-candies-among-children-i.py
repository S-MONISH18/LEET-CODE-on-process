class Solution(object):
    def distributeCandies(self, n, limit):
        count = 0
        for x1 in range(limit + 1):
            low = max(0, n - x1 - limit)
            high = min(limit, n - x1)
            if low <= high:
                count += high - low + 1

        return count
        