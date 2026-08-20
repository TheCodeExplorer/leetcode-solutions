import java.util.*;

class Solution {
    public int maxFreqSum(String s) {
            HashMap<Character,Integer> mapv = new HashMap<>();
            HashMap<Character,Integer> mapc = new HashMap<>();
            int maxv =0;
            int maxc =0;
           int n = s.length();
           for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if("aeiou".indexOf(ch) != -1){
                mapv.put(ch,mapv.getOrDefault(ch,0)+1);
            }
            else{
                mapc.put(ch,mapc.getOrDefault(ch,0)+1);
            }
           }
            for (int v : mapv.values()) {
            maxv = Math.max(v, maxv);
        }
        for (int c : mapc.values()) {
            maxc = Math.max(c, maxc);
        }
        return maxv + maxc;
    }
}