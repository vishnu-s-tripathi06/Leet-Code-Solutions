import java.util.Arrays;

public class Problem_48 {
    public static void main(String[] args) {
        int[][] matrix={
            {5,1,9,11},
            {2,4,8,10},
            {13,3,6,7},
        };
        rotate(matrix);
        for(int r=0;r<matrix.length;r++){
            System.out.println(Arrays.toString(matrix[r]));
        }
    }

     public static void rotate(int[][] matrix) {

        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //reverse each row
        for(int i=0;i<matrix.length;i++){
           int col=0, enCol=matrix[0].length-1;
           while(col<enCol){
            int temp=matrix[i][col];
            matrix[i][col]=matrix[i][enCol];
            matrix[i][enCol]=temp;
            col++;
            enCol--;
           }
        }
    }
}
