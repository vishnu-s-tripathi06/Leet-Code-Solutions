public class Problem_152 {
    public static void main(String[] args) {
        int[] nums={2,3,-2,4};
        int answer=maxProduct(nums);
        System.out.println(answer);
    }
     public static int maxProduct(int[] nums) {
     int max=nums[0];
     for(int start=0;start<nums.length;start++){
        int product=1;
        for(int end=start;end<nums.length;end++){

        product *= nums[end];
        max = Math.max(max, product);
        }
     }

    return max;
    }
}
