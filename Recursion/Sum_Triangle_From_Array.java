import java.util.Arrays;

public class Sum_Triangle_From_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        SumTriangle(arr);
    }
        

    static void SumTriangle(int[] arr){
        if(arr.length==1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        
        int[] ans=new int[arr.length-1];
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            ans[k++]=arr[i]+arr[i+1];
        }
         
        SumTriangle(ans);
        System.out.println(Arrays.toString(arr));
       
    }
    
}
