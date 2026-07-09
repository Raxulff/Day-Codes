class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int ind1 = 0;
        for(int val : nums){
            if(val < pivot){
                result[ind1] = val;
                ind1++;
            }
        }

        System.out.println("less than pivot");
        for(int val : result){
            System.out.print(val+" ");
        }

        for(int val : nums){
            if(val == pivot){
                result[ind1++] = val;
            }
        }
        System.out.println("\nEqual to  pivot");
        for(int val : result){
            System.out.print(val+" ");
        }
        for(int val : nums){
            if(val > pivot){
                result[ind1++] = val;
            }
        }
        return result;
    }
}