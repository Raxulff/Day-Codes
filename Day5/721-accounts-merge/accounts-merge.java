class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int N = accounts.size();
        DSU obj = new DSU(N);
        HashMap<String,Integer> map = new HashMap<>();
        for(int ind = 0;ind < N;ind++){
            int n = accounts.get(ind).size();
            for(int ind2 = 1;ind2 < n;ind2++){
                String email = accounts.get(ind).get(ind2);
                if(map.containsKey(email)){
                    obj.unionRank(ind,map.get(email));
                }else{
                    map.put(email,ind);
                }
            }
        }

        List<List<String>> groupEmail = new ArrayList<>();
        for(int ind = 0;ind < N;ind++){
            groupEmail.add(new ArrayList<>());
        }

        //groupEmail.sort((x,y)->Integer.compare(x[0],y[0]));
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            int parent = obj.findUltimateParent(entry.getValue());
            groupEmail.get(parent).add(entry.getKey());
        }

        List<List<String>> result = new ArrayList<>();
        for (int ind = 0; ind < N; ind++) {
            if (groupEmail.get(ind).isEmpty()) continue;  
            Collections.sort(groupEmail.get(ind));
            List<String> merged = new ArrayList<>();
            merged.add(accounts.get(ind).get(0)); 
            merged.addAll(groupEmail.get(ind));
            result.add(merged);
        }
        return result;

    }
}
class DSU{
    int[] parent;
    int[] rank;

    DSU(int n){
        parent = new int[n];
        rank = new int[n];
        for(int ind = 0;ind < n;ind++){
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
        }
        else if(rank[ultimateParent1] > rank[ultimateParent2]){
            parent[ultimateParent2] = ultimateParent1;
        }
        else{
            parent[ultimateParent1] = ultimateParent2;
            rank[ultimateParent2]++;
            //parent[ultimateParent2] = ultimateParent1;
            //rank[ultimateParent1]++;
        }
        return true;
    }
}