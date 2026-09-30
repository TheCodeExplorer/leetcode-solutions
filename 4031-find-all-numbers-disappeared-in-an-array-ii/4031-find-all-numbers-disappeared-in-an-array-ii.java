class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> ans = new ArrayList<>();
            boolean []found = new boolean[upper-lower+1];
            for(int j=0;j<nums.length;j++){
                if(nums[j]>=lower && nums[j]<=upper){
                    found[nums[j]-lower] = true;
                }
            }
                int start = -1;
        for(int i =0;i < found.length;i++){
            if(!found[i] && start ==-1){
                start = i+lower;
            }
            if((found[i]||i == found.length-1) && start != -1){
                int end;
                if(found[i])
                    end = i+lower-1;
                else
                    end = i+lower;
                List<Integer> temp = new ArrayList<>();
                temp.add(start);
                temp.add(end);
                ans.add(temp);
                start = -1;
            }
        }
        return ans;
    }
}

