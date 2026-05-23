public class Problem_885 {
    public static void main(String[] args) {
        
    }
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int n=rows*cols;//size of matrix
        int[][] result=new int[n][2];
        int count=0;
        int[][] directions={
            {0,1},
            {1,0},
            {0,-1},
            {-1,0}
        };
        int dir=0;
        result[count][0]=rStart;
        result[count][1]=cStart;
        count++;
        int stepLength=1;
        while(count<n){
            for(int i=0;i<2;i++){
                for(int step=0;step<stepLength;step++){
                    rStart+=directions[dir][0];
                    cStart+=directions[dir][1];
                    if(rStart>=0 && rStart<rows &&cStart>=0 && cStart<cols){
                        result[count][0]=rStart;
                        result[count][1]=cStart;
                        count++;
                    }
                   
                }
                 dir=(dir+1)%4;
                
            }
            stepLength++;
        }





        return result;
    }
}
