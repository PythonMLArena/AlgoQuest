
# Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

# You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

# Return the answer with the smaller index first.

# Input: 
# nums = [3,4,5,6], target = 7

# Output: [0,1]



#-----------------------------------------------------------------------------------------------------------------------------------
class Solution():
    def __init__(self, nums,target):
        self.nums = nums
        self.target = target
        
    def brute_force(self):
        start=0
        
        for i in range(start, len(self.nums)):
            for j in range(i+1, len(self.nums)):
                if self.nums[i] + self.nums[j] == self.target:
                    return [i, j]
                
    def optimal_approach(self):
        
        
        
nums=[3,4,5,6]
target=7

sol = Solution(nums, target)
sol.brute_force()
    
    
    
    


