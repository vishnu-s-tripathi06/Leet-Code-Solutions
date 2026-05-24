public class Problem_74 {
    public static void main(String[] args) {
        int[][] matrix={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        boolean target=searchMatrix(matrix,11);
        System.out.println("element found at: "+target);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int start=0;
        int row=matrix.length , col=matrix[0].length;
        int end=row*col-1;
       
        while(start<=end){
            int mid=start+(end-start)/2;

            int midRow=mid/row , midCol=mid%col;
            if(matrix[midRow][midCol]==target) return true;
            else if(matrix[midRow][midCol]>target) end=mid-1;
            else start=mid+1;

        }
 


        return false;
    }
}
