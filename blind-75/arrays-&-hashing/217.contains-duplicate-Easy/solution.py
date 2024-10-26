class Solution:
    def __init__(self,nums):
        self.nums = nums

    def brute_force(self):
        """
        In this implementation we have created a Dictionary Object for nums array
        
        Dictionary contains key(number) and value(Count) of the key which is present inside of that list

        Returns:
            boolean: return true if the any number count is equal or greater than 2 
        """
        dict1={}
        
        for i in self.nums:
            dict1[i] = 1+dict1.get(i, 0)
            
        for i in dict1:
            if dict1[i] >=2:
                return True
            
        return False
    
    
            
            
        
        