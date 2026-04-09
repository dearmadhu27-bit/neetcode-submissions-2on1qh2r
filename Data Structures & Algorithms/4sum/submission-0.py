class Solution:
    def fourSum(self, arr: List[int], target: int) -> List[List[int]]:
        arr.sort()
        n = len(arr)
        result = []
        for i in range (0,n):
            for j in range (i+1,n):
                for k in range (j+1,n):
                    for l in range (k+1,n):
                        total = arr[i]+arr[j]+arr[k]+arr[l]
                        if total == target:
                            mad = [arr[i],arr[j],arr[k],arr[l]]
                            if mad not in result:
                                result.append(mad)
        return result



        
        