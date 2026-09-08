class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> newmap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            newmap.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++) {
            int x = target - nums[i];
            if(newmap.get(x)!=null && newmap.get(x)!=i) {
                return new int[]{i, newmap.get(x)};
            }
        }

        return new int[]{0,0};
    }
}
