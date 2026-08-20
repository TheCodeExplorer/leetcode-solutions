class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> nums1 = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();

        nums1.add(nums[0]);
        nums2.add(nums[1]);

        for(int i=2; i<nums.length; i++){
            int last1 = nums1.get(nums1.size()-1);
            int last2 = nums2.get(nums2.size()-1);

            if(last1> last2) nums1.add(nums[i]);
            else nums2.add(nums[i]);
        }

        int res[] = new int[nums.length];
        int idx=0;
        for(int num:nums1) res[idx++] = num;
        for(int num:nums2) res[idx++] = num;

        return res;

    }
}