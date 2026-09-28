class Solution {
    public int scoreOfString(String s) {
        int so= 0;
        for(int i =0;i<s.length()-1;i++){
            so+= Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return so;
    }
}