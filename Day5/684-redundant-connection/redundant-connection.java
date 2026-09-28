class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int N = edges.length;
        DSU obj1 = new DSU(N);
        int[] ans = new int[2];
        for(int[] edge : edges){
            int node1 = edge[0];
            int node2 = edge[1];
            if(!obj1.unionRank(node1,node2)){
                ans[0] = node1;
                ans[1] = node2;
            }
        }
        return ans;
    }
}
class DSU{
    int[] parent;
    int[] rank;

    DSU(int n){
        parent = new int[n+1];
        rank = new int[n+1];
        for(int ind = 0;ind <=n;ind++){
            parent[ind] = ind;
        }
    }

    public int findUltimateParent(int node){
        if(node == parent[node]) return node;
        return parent[node] = findUltimateParent(parent[node]);
    }

    public boolean unionRank(int node1,int node2){
        int ultimateParent1 = findUltimateParent(node1);
        int ultimateParent2 = findUltimateParent(node2);

        if(ultimateParent1 == ultimateParent2){
            return false;
        }

        if(rank[ultimateParent1] < rank[ultimateParent2]){
            parent[ultimateParent1] = ultimateParent2;
        }else if(rank[ultimateParent2] < rank[ultimateParent1]){
            parent[ultimateParent2] = ultimateParent1;
        }else{
            parent[ultimateParent2] = ultimateParent1;
            rank[ultimateParent1]++;
        }
        return true;
    }
}