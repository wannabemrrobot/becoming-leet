class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # index starts with 1, cz the first element always unique. (sorted array)
        index = 1
        
        for i in range(len(nums)-1):
            if nums[i] != nums[i+1]:
                nums[index] = nums[i+1]
                index = index + 1
        return index

# Runtime: 80 ms, faster than 91.88% of Python3 online submissions for Remove Duplicates from Sorted Array.
# Memory Usage: 15.6 MB, less than 79.18% of Python3 online submissions for Remove Duplicates from Sorted Array.