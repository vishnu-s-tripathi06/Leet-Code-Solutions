public class Problem_1886 {
    public static void main(String[] args) {
        int[][] matrix={
            {1,0},
            {0,1}
        };
        int[][] target={
            {0,1},
            {1,0}
        };
        boolean answer=findRotation(matrix, target);
        System.out.println(answer);

    }
     public static boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        for(int i=0;i<4;i++){
            boolean answer=true;
            for(int r=0;r<n;r++){
                for(int c=0;c<n;c++){
                    if(mat[r][c]!=target[r][c]){
                        answer=false;
                    }
                }
            }
            
            if(answer){
                return true;
            }
            int[][] rotated=new int[n][n];
            for(int r=0;r<n;r++){
                for(int c=0;c<n;c++){
                    rotated[c][n-1-r]=mat[r][c];
                }
            }
            mat=rotated;



        }
        return false;
            }
        }
    
        
                
           
            

      
