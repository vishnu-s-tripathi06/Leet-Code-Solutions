import java.util.Arrays;
public class Problem_238 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] answer=productExceptself(nums);
        System.out.println(Arrays.toString(answer));
    }
        

    public static int[] productExceptself(int[] nums){
        int[] answer=new int[nums.length];
        for(int k=0;k<nums.length;k++){
            int mult=1;
            int excluded=k;
            for(int i=0;i<nums.length;i++){
            
                if(i!=excluded){
                    mult*=nums[i];
                }
                }
                answer[k]=mult;
           
            
        }

        return answer;
    }
}
