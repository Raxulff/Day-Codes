class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> set1 = new HashSet<>();
        
        int count = 0;
        int[] ans = new int[A.length];
        for(int ind = 0;ind < A.length;ind++){
            if(!set1.contains(A[ind])){
                set1.add(A[ind]);
            }else{
                count++;
            }
            if(!set1.contains(B[ind])){
                set1.add(B[ind]);
            }else{
                count++;
            }
            ans[ind] = count;
        }
        return ans;
    }
}