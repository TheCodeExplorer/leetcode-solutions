class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        for(int[] val:mat){
            int n = val.length;
            for(int i=0;i<n;i++){
                if(val[i]!=val[(i+k)%n]){
                    return false;
                }
            }
        }
        return true;
    }
}