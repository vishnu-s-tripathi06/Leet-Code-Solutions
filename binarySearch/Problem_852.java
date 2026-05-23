public class Problem_852 {
    public static void main(String[] args) {
        int[] arr={1,3,5,8,6,4,2};
        int answer=peakOfMountain(arr);
        System.out.println(answer);
    }
    public static int peakOfMountain(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start < end){

            int mid=start + (end-start) / 2;


            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;

            }
            else{
                end = mid;
            }
        }

            
        return start;
    }
}
       
        
           
               



