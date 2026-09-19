class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        while (temp != 1 && temp != 4) {
            int s = 0;
            while (temp > 0) {
                int k = temp % 10;  
                s += k * k;          
                temp /= 10;     
            }
            temp = s;              
        }

        return temp == 1;
    }
}