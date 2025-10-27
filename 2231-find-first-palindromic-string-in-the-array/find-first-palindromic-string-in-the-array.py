class Solution(object):
    def firstPalindrome(self, words):
        for i in words:
            if i==i[::-1]:
                return i
                break
            
        return ""
            
        """
        :type words: List[str]
        :rtype: str
        """
        