class Solution {
    public int findClosest(int x, int y, int z) {
        int k = Math.abs(z-x);
        int m = Math.abs(z-y);
        if(k==m) return 0;
        else if (k>m) return 2;
        return 1;
    }
}