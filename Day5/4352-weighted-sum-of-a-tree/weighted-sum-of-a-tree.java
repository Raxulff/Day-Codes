class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;
        List<List<Integer>> tree = new ArrayList<>();
        for(int ind = 0;ind < n;ind++){
            tree.add(new ArrayList<>());
        }
        int root = -1;
        for(int ind = 0;ind < n;ind++){
            if(parent[ind] == -1){
                root = ind;
            }else{
                tree.get(parent[ind]).add(ind);
            }
        }

        long[] depth = new long[n];
        long maxHeight = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int current = queue.poll();

            for(int child : tree.get(current)){
                depth[child] = depth[current]+1;
                maxHeight = Math.max(maxHeight,depth[child]);
                queue.add(child);
            }
        }

        long totalwei = 0;
        for(int ind = 0;ind < n;ind++){
            totalwei+=(long) nums[ind]*(maxHeight - depth[ind] +1);
        }
        return totalwei;
    }
}