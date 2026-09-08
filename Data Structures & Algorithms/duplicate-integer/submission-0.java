class Solution {
    public boolean hasDuplicate(int[] nums) {
        int length = nums.length;

        Set<Integer> newset = new HashSet<>();
        for(int i=0; i<length; i++) {
            newset.add(nums[i]);
        }

        if(newset.size() != length) {
            return true;
        } else {
            return false;
        }
    }
}