class Solution {
    public boolean checkDivisibility(int n) {
     int sum =0;
     int pro =1;
     int org = n;
     while(n>0){
        int temp = n%10;
        sum+=temp;
        pro*=temp;
        n /=10;
     }
        if(org%(sum+pro)==0){
            return true;
        }
        else{
            return false;
        }

    }
}