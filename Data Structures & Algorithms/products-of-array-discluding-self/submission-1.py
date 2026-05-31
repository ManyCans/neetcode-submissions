class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prod , zero_cnt =1,0
        for i in nums:
            if i==0:
                zero_cnt += 1
            else:
                prod = prod * i
        if zero_cnt>1:
            return [0] * len(nums)

        res = [0] * len(nums)
        for i, c in enumerate(nums):
            if zero_cnt: res[i]=0 if c else prod
            else: res[i]=prod//c
        return res


        