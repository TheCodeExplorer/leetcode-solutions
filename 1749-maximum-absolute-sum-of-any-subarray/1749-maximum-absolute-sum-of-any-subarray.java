class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = 0,min =0;
        int curmax =0, curmin =0;
        for(int num:nums){
             curmax = Math.max(num, curmax+num);
             curmin = Math.min(num, curmin+num);
            max = Math.max(max,curmax);
            min = Math.min(min,curmin);

        }
        return Math.max(max,Math.abs(min));
    }
}