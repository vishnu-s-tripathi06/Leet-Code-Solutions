public class Problem_59{
    public static void main(String[] args) {
        int n=3;
        int[][] n2=generateMatrix(n);
        System.out.println(n2.toString());
    }
    public static int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int digits=0;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                digits++;
                matrix[top][i]=digits;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                digits++;
                matrix[i][right]=digits;
            }
            right--;
            if (top <= bottom) {
                for(int i=right;i>=left;i--){
                digits++;
                matrix[bottom][i]=digits;
            }}
            bottom--;
            if (left <= right) {
                for(int i=bottom;i>=top;i--){
                    digits++;
                    matrix[i][left]=digits;
               
                }}
            left++;
    
        }
    

        return matrix;
    }
        
    
    
    

}