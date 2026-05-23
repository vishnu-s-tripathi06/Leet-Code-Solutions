public class Problem_1572 {
    public static int main(int[][] mat) {
        int sum=0;
        int n=mat.length;
         for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            sum+=mat[i][n -1 -i];
        }


        if(n%2!=0){
           sum-=mat[n/2][n/2];
       }
     
           






        /*
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                     sum+=mat[i][j];
                   
                    }
                if(i+j==mat.length-1 && i+j!=2*i){
                    sum+=mat[i][j];
                
                   
                }
            }
        }
        return sum; 
        
        
        
        [1,2,3,4]
        [1,2,3,5]
        [1,2,3,4]
        [1,2,3,4]           {(3,0) , (2,1) , (1,2) , (0,3)}
        */



return sum;
      
            

    }
}
