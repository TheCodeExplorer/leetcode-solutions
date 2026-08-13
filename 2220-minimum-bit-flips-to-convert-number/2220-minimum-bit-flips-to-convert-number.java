class Solution {
    public int minBitFlips(int start, int goal) {
        int c = 0;
        int sb = start^goal;
        while(sb!=0){
            c+=sb&1;
            sb = sb>>1;
        }
        return c;
    }
}