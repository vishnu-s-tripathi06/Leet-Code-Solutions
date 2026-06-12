import java.util.Arrays;
public class Problem_238 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] answer=productExceptself(nums);
        System.out.println(Arrays.toString(answer));
    }
        

    public static int[] productExceptself(int[] nums){
    int n = nums.length;
    int[] answer = new int[n];

    answer[0] = 1;
    for (int i = 1; i < n; i++) {
        answer[i] = answer[i - 1] * nums[i - 1]; //
    }
    int rightProduct = 1;
    for (int i = n - 1; i >= 0; i--) {
        answer[i] = answer[i] * rightProduct;
        rightProduct *= nums[i];
    }

    return answer;
        // int[] answer=new int[nums.length];
        // for(int k=0;k<nums.length;k++){
        //     int mult=1;
        //     int excluded=k;
        //     for(int i=0;i<nums.length;i++){
            
        //         if(i!=excluded){
        //             mult*=nums[i];
        //         }
        //         }
        //         answer[k]=mult;
           
            
       
    }
}
