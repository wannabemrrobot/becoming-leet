class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMap = {}
        
        for index in range(len(nums)):
            num = nums[index]
            complement = target - num
            if num in hashMap:
                return [hashMap[num], index]
            else:
                hashMap[complement] = index

# Runtime: 86 ms, faster than 43.50% of Python3 online submissions for Two Sum.
# Memory Usage: 15.4 MB, less than 40.83% of Python3 online submissions for Two Sum.