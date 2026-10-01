class Solution {
    public boolean checkRecord(String s) {
        HashMap<Character,Integer> map = new HashMap<>(); 
        int c = 0;
        for(char ch :s.toCharArray()){
            if(ch =='A') c++;
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        if(c>=2) return false;
        for(int i=0;i<=s.length()-3;i++){
            if(s.charAt(i)=='L'&& s.charAt(i+1)=='L'&& s.charAt(i+2)=='L')
            return false;
        }
    return true;
        
    }
}