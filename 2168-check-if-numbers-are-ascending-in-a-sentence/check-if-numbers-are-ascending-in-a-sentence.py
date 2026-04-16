class Solution(object):
    def areNumbersAscending(self, s):
        splitarr=s.split(" ")
        li=[]
        for i in splitarr:
            if i.isdigit():
                li.append(int(i))
        for i in range(1,len(li)):
            if li[i]<=li[i-1]:
                return False
        return True

