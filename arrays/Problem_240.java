public class Problem_240 {
    public static void main(String[] args) {
        int[][] matrix={
            {5,1,9,11},
            {2,4,8,10},
            {13,3,6,7},
        };
    int target=7;
    }
     public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        int m=matrix.length;
        int n=matrix[0].length;
        while(i<m && j>=0){
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]>target) j--;
            else i--;

        }

       return false;
    }
}
