class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        index = 0
        prev_num = None
        skipJLoop = False

        for i in range(len(nums)):
            skipJLoop = False
            if prev_num != nums[i]:
                if i != (len(nums)-1):
                    for j in range(i+1, len(nums)):
                        if skipJLoop == False:
                            nums[index] = nums[i]  # assign duplicate to the first of array
                            prev_num = nums[i]     # set the previous number
                            index = index + 1
                            skipJLoop = True
                else:
                    nums[index] = nums[i]
                    prev_num = nums[i]
                    index = index + 1
                    skipJLoop = True
        
        # nums = nums[:index]
        return index


# Runtime: 243 ms, faster than 5.84% of Python3 online submissions for Remove Duplicates from Sorted Array.
# Memory Usage: 15.7 MB, less than 46.00% of Python3 online submissions for Remove Duplicates from Sorted Array.