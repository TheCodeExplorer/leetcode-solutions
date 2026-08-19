class Solution {
    public int sumOfPrimesInRange(int n) {
        int sum =0;
        int rev = 0;
        int org =n;
        // if(n<10) return 0;
        while(n!=0){
            int temp = n %10;
             rev = rev*10+temp;
             n /=10;
        }
        int f = Math.min(org,rev);
        int l = Math.max(org,rev);
        for(int i=f;i<=l;i++){
            if (i < 2) continue;
        int c =0;
            for(int j =2;j*j<=i;j++){
                if(i%j==0){
                    c++;
                    break;
                }
            }
              if(c==0){
                sum+=i;
              }
        }
        return sum;
    }
}