// logic diff
// OG sol had the right idea, had to simplify complexity of alg further
// need to utilize the fact that the array is sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];

            if (sum > target) {
                r--;
            } else if (sum < target) {
                l++;
            } else {
                return new int[]{l+1, r+1};
            }
        }
        
        return new int[]{0};
    }
}
