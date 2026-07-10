class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b) -> Integer.compare(a[0] - a[1],b[0] - b[1]));
        for(int ind = 0;ind < costs.length;ind++){
            for(int ind2 = 0;ind2 < costs[0].length;ind2++){
                System.out.print(costs[ind][ind2]+" ");
            }
            System.out.println();
        }

        int total = 0;
        for(int ind = 0;ind < costs.length/2;ind++){
            total+= costs[ind][0];
        }

        for(int ind = costs.length/2;ind < costs.length;ind++){
            total+= costs[ind][1];
        }
        return total;
    }
}