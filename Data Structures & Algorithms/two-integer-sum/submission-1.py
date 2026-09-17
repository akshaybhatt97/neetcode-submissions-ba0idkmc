class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        count = {}

        for i , a in enumerate(nums):
            diff = target - a

            if diff in count:
                return [count[diff] , i]
            
            count[a] = i
        
        return [- 1 , - 1]

        