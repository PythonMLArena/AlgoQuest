class Solution:
    def __init__(self,s,t):
        self.s=s
        self.t=t
        
    def brute_force(self):
        """
        Anagram : Word which can be formed by rearranging the letter of different word or phrase , using of all letters exactly once
        In this implementation we have created 2 Dictionary Objects for both strings and we are comparing them 
        
        if the Dictionary object are not equal then 

        Returns:
            boolean: return true if the dictionary object is equal to the other dictionary object
        """
        dict1={}
        dict2={}
        
        for i in self.s:
            dict1[i] = 1+dict1.get(i, 0)
            
        for i in self.t:
            dict2[i] = 1+dict2.get(i, 0)
            
        return dict1==dict2
    
    
    
            
            
        
        