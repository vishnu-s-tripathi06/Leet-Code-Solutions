public class Problem_1252 {
    public static int main(int m, int n, int[][] indices) {
       
        int[][] matrix=new int[m][n];
        int[] operations;
        int column;
        int row;
        int count=0;
       
        for(int i=0;i<indices.length;i++){
            operations=indices[i];
            column=operations[1];
            row=operations[0];


        for(int j=0;j<matrix[row].length;j++){
            matrix[row][j]+=1;
        }

       

        for(int j=0;j<matrix.length;j++){
            matrix[j][column]+=1;
        }
           

        
        }

 
       for(int k=0;k<matrix.length;k++){
            for(int j=0;j<matrix[k].length;j++){
                int element=matrix[k][j];
                if(element%2!=0){
                    count++;
                }

            }
        }

        return count;

    }
}
        





