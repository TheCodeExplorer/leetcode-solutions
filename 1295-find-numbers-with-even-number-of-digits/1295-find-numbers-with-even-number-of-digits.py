class Solution:
    def findNumbers(self, nums: list[int]) -> int:
        c = 0
        for i in range(0,len(nums)):
            cc =0
            temp = nums[i]
            while temp>0:
                # numb = temp%10
                cc+=1
                temp//=10
            if cc%2==0:
                    c+=1
        return c
        