class Solution:
    def maximumWealth(self, accounts: list[list[int]]) -> int:
      max = 0 
      for customer in accounts:
        cur = sum(customer)
        if cur>max:
            max = cur 
      return max 
        