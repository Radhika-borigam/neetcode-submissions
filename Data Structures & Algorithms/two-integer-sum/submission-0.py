class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        indexed_nums = sorted([(n, i) for i, n in enumerate(nums)])
        left, right = 0, len(indexed_nums) - 1
        result = []
        while left < right:
            current_sum = indexed_nums[left][0] + indexed_nums[right][0]
            if current_sum == target:
                result = sorted([indexed_nums[left][1], indexed_nums[right][1]])
                break
            elif current_sum < target:
                left += 1
            else:
                right -= 1
        return result