class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m=matrix.length;
        int n=matrix[0].length;
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->(b-a));
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pq.size()<k){
                    pq.add(matrix[i][j]);
                }
                else{
                    if(pq.peek()>matrix[i][j]){
                        pq.remove();
                        pq.add(matrix[i][j]);
                    }
                }

            }
        }
        return pq.peek();
    }
}
