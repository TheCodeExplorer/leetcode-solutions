class Solution:
    def reverseString(self, s: list[str]) -> None:
        n = len(s)
        for i in range(n//2):
            temp = s[i]
            s[i] = s[n-1-i]
            s[n-1-i] = temp
        """
        Do not return anything, modify s in-place instead.
        """
        
        