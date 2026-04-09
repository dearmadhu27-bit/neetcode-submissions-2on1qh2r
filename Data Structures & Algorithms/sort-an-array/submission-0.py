class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        def quicksort(arr):
            if len(arr) <= 1:
                return arr

            pivot = arr[len(arr)//2]

            left = [x for x in arr if x < pivot]
            middle = [x for x in arr if x == pivot]
            right = [x for x in arr if x > pivot]

            return quicksort(left) + middle + quicksort(right)

        return quicksort(nums)