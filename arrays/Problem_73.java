public class Problem_73 {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        setZeroes(matrix);
        System.out.println(matrix.toString());

    }
      public static void setZeroes(int[][] matrix) {
       
        boolean[] row=new boolean[matrix.length];
        boolean[] col=new boolean[matrix[0].length];
        for(int r=0;r<matrix.length;r++){
            for(int c=0;c<matrix[r].length;c++){
                if(matrix[r][c]==0){
                    row[r]=true;
                    col[c]=true;
                   
                }
            }
        }

        for(int r=0;r<matrix.length;r++){
            for(int c=0;c<matrix[r].length;c++){
                if(row[r]==true || col[c]==true){
                    matrix[r][c]=0;
                }


            }}

      }
}
