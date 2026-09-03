class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int n = seats.length;
        Arrays.sort(seats);
        Arrays.sort(students);
        int s =0;
        for(int i=0;i<n;i++){
            // int k = Math.max(students[i],seats[i]);
            // int l = Math.min(students[i],seats[i]);
                s+=Math.abs(students[i]-seats[i]);
        }
        return (s);
    }
}