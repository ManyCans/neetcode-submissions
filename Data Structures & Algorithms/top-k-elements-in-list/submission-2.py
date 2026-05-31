class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        freq =[[] for i in range(len(nums)+1)]

        for i in nums:
            count[i]= 1+ count.get(i,0)

        for i,n in count.items():
            freq[n].append(i)
        
        ans = []
        for i in range(len(freq)-1,0,-1):
            for num in freq[i]:
                ans.append(num)
                if k == len(ans):
                    return ans

        