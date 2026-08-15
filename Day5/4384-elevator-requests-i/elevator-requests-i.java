class Solution {
    public int elevatorRequests(int n, int[] arr) {
        int sum = arr[0];
        for(int ind = 1;ind < arr.length;ind++){
            sum = sum + Math.abs(arr[ind]-arr[ind-1]);
        }
        System.out.print(sum);
        return sum;
    }
}