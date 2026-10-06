class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int maxDigit = 0;
            int minDigit = 9;
            while (n > 0) {
                int digit = n % 10;
                maxDigit = Math.max(maxDigit, digit);
                minDigit = Math.min(minDigit, digit);
                n /= 10; 
            }

            int range = maxDigit - minDigit;
            maxRange = Math.max(maxRange, range);
        }
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int maxDigit = 0;
            int minDigit = 9;
            while (n > 0) {
                int digit = n % 10;
                maxDigit = Math.max(maxDigit, digit);
                minDigit = Math.min(minDigit, digit);
                n /= 10;
            }

            if (maxDigit - minDigit == maxRange) {
                totalSum += nums[i];
            }
        }

        return totalSum;
    }
}