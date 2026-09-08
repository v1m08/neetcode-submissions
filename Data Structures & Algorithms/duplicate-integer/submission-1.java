class Solution {
    public boolean hasDuplicate(int[] nums) {
        int length = nums.length;

        Set<Integer> newset = new HashSet<>();
        for(int i=0; i<length; i++) {
            if(!newset.add(nums[i])) {
                return true;
            }
        }

        return false;
    }
}