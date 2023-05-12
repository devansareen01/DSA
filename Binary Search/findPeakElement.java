class Solution {
   public int[] findPeakGrid(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int startrow=0;
        int endrow=m-1;
        while(startrow<=endrow){
            int midrow= startrow+(endrow-startrow)/2;
            int index=findmaxi(mat[midrow]); // will give the index
            if(midrow==0){
                if(mat[midrow][index]>mat[midrow+1][index]) return new int[]{midrow,index};
                else startrow=midrow+1;
            }
            else if(midrow==m-1){
                if(mat[midrow][index]>mat[midrow-1][index]) return new int[]{midrow,index};
                else endrow=midrow-1;
            }
            else if(mat[midrow][index]>mat[midrow-1][index] && mat[midrow][index]>mat[midrow+1][index]) return new int[]{midrow,index};
            else{
                if(mat[midrow+1][index]>mat[midrow][index]) startrow=midrow+1;
                else endrow=midrow-1;
            }
        }
        return new int[]{0,0};
    }
    private int findmaxi(int [] matrix){
        int maxi=matrix[0];
        int index=0;
        for(int i=1;i<matrix.length;i++){
            if(matrix[i]>maxi){
                maxi=matrix[i];
                index=i;
            }
        }
        return index;
    }
}
