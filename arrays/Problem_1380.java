import java.util.ArrayList;
import java.util.List;

public class Problem_1380 {
    public static void main(String[] args) {
        System.out.println("hello,World!");
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        List<Integer> answer=luckyNumbers(matrix);
        System.out.println(answer);
    }



    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
         
        
        for(int r=0;r<matrix.length;r++){
            int smallestElementInRow=matrix[r][0];
            int colIndex=0;
            boolean isLucky=true;  
            for(int c=0;c<matrix[r].length;c++){
                
                if(matrix[r][c]<smallestElementInRow){
                    smallestElementInRow=matrix[r][c];
                    colIndex=c;
                    
                }

                
                }
                for(int i=0;i<matrix.length;i++){
                    if(matrix[i][colIndex]>smallestElementInRow){
                        isLucky=false;
                        break;
                }
            }
                    if(isLucky){
                        answer.add(smallestElementInRow);
                    }
            
                }
                    return answer;
                
            }
        }
            
       
                
                
    

      
  
        
    

    
