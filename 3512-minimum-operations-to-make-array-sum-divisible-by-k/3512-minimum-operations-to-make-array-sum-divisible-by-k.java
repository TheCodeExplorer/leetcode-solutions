class Solution {
    public int minOperations(int[] nums, int k) {
        // int sum =0;
        // for(int i =0;i<nums.length;i++){
        //     sum +=nums[i];
        // }
        // return sum%k;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
        }
        int o =0;
        while(sum%k!=0){ sum--; o++;}
        return o;

    }
}