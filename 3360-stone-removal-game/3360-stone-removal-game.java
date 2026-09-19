class Solution {
    public boolean canAliceWin(int n) {
        if (n < 10) {
            return false;
        }

        int stonesLeft = n - 10;
        int remove = 9;

        while (stonesLeft >= remove) {
            stonesLeft -= remove;
            remove--;

            if (stonesLeft < remove) {
                return false;
            }
            stonesLeft -= remove;
            remove--;
        }

        return true;
    }
}