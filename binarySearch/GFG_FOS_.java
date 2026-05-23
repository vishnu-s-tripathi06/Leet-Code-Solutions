public class GFG_FOS_ {
    public static void main(String[] args) {
    int[] arr={2,4,6,7,8,9,9,10,15,16};
    int k=49;
    int answer=firstSearch(arr, k);
    System.out.println("Element found at Index: "+answer);
    }


    public static int firstSearch(int[] arr, int k) {
        // Code Here
        int answer=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k){
                answer=mid;
                end=mid-1;

            }
            else if(arr[mid]>k){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
         return answer;



       

}
}
