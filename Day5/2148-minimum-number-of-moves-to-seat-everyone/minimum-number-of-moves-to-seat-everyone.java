class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int move = 0;
        int n = seats.length;
        int ind = 0;
        while(ind < n){
            move = move + Math.abs(seats[ind] - students[ind++]);
        }
        return move;
    }
}