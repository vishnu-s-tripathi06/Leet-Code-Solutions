public class Problem_867 {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] answer=transpose(matrix);
        System.out.println(answer.toString());
    }
     public static int[][] transpose(int[][] matrix) {
        int[][] mat=new int[matrix[0].length][matrix.length];

        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                int n= matrix[row][col];
                mat[col][row]=n;
            }
        }
        return mat;
    }
}
