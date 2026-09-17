class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;
        Set<Integer> h = new HashSet<Integer>();
        for(int i=0; i<len; i++) {
            if(h.contains(nums[i]))
                return true;
            else
                h.add(nums[i]);
        }
        return false;

        //using streams one liner below
        // return Arrays.stream(nums).distinct().count() < nums.length;
    }
}