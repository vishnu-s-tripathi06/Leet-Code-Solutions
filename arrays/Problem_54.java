import java.util.ArrayList;
import java.util.List;

public class Problem_54 {
    public static void main(String[] args) {
       int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    List<Integer> n=spiralOrder(matrix);
    for(int r: n){
        System.out.println(r);
    }
    
        }
public static List<Integer> spiralOrder(int[][] matrix){
    List<Integer> numbers = new ArrayList<>();
                                        
                                                                    
    int top=0;
    int bottom=matrix.length-1;
    int left=0;
    int right=matrix[0].length-1;
    while (top <= bottom && left <= right) {
        // top row
        for (int i = left; i <= right; i++) {
            numbers.add(matrix[top][i]);
            }
            top++;

         // right column
        for (int i = top; i <= bottom; i++) {
            numbers.add(matrix[i][right]);
            }
            right--;

        // bottom row
        if (top <= bottom) {
            for (int i = right; i >= left; i--) {
                numbers.add(matrix[bottom][i]);
                 }
                bottom--;
                }

        // left column
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                 numbers.add(matrix[i][left]);
                }
                left++;
            }
}
            return numbers;
        }}
                                                                   // }
                                                                  //  {
                                                                   //     [1,2,3],
                                                                   //     [4,5,6],  
                                                                   //     [7,8,9];
                                                                   // } *






          
            
