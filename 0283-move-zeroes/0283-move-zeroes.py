class Solution:
    def moveZeroes(self, nums: list[int]) -> None:
        k = 0
        for i in range (0,len(nums)):
            if nums[i]!=0:
                nums[k] = nums[i]
                k+=1
        for i in range(k,len(nums)):
            nums[i] = 0
        