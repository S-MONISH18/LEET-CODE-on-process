class Solution(object):
    def shiftingLetters(self, s, shifts):
        ans, shift = '', 0
        for i in range(len(shifts) -1, -1, -1):
            ans += chr((ord(s[i]) - ord('a') + shift+shifts[i]) % 26 + ord('a'))
            shift += shifts[i]
        
        return ans[::-1]