class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for(int ind1 = 0;ind1 < nums1.length;ind1++){
            int A = nums1[ind1];
            for(int ind2 = 0;ind2 < nums2.length;ind2++){
                int B = nums2[ind2]*k;
                if(A%B == 0) count++;
            }
        }
        return count;
    }
}