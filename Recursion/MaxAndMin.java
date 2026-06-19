import java.util.Arrays;
public class MaxAndMin {
     public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] ans={arr[0],arr[0]};
        System.out.println(Arrays.toString(maxMin(arr,ans,0)));
    }

    static int[] maxMin(int[] arr,int[] ans,int idx){
        if(idx==arr.length) return ans;
        
        ans[0]=Math.min(ans[0],arr[idx]);    
        ans[1]=Math.max(ans[1], arr[idx]);
        maxMin(arr, ans, ++idx);
       
        return ans;
    }
      
//     static int[] maxMin(int[] arr, int idx) {

//     if (idx == arr.length - 1) {
//         return new int[]{arr[idx], arr[idx]};
//     }

//     int[] ans = maxMin(arr, idx + 1);

//     ans[0] = Math.min(ans[0], arr[idx]);
//     ans[1] = Math.max(ans[1], arr[idx]);

//     return ans;
// }  
}
