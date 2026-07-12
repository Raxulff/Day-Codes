class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));
        for(int temp[] : intervals){
            for(int val : temp){
                System.out.print(val+" ");
            }
            System.out.println();
        }
        
        int n = intervals.length;
        int prevEnd = Integer.MIN_VALUE;
        int count = 0;

        for(int ind = 0;ind < n;ind++){
            int st = intervals[ind][0];
            int end = intervals[ind][1];
            if(st < prevEnd){
                
                count++;
            }else{
                prevEnd = Math.max(end,prevEnd);
            }
        }
        return count;
    }
}