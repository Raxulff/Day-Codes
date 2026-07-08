class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int ind = 0;ind < n;ind++){
            int left = ind+1;
            int right = n-1;
            while(left < right){
                int nums1 = nums[ind];
                int nums2 = nums[left];
                int nums3 = nums[right];
                int sum = nums1 + nums2 + nums3;
                if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums1);
                    temp.add(nums2);
                    temp.add(nums3);
                    set.add(temp);
                    left++;
                    right--;
                }
                if(sum < 0){
                    left++;
                }
                if(sum > 0){
                    right--;
                }
            }

        }
        for(List<Integer> a : set){
            list.add(a);
        }
        return list;
    }
}