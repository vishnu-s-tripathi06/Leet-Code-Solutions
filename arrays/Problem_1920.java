class Problem_1920{
    public static int[] main(int[] nums) {
        
        int[] ans=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            int x=nums[nums[i]];
            ans[i]=x;
        }
        return ans;
    }
}
          
            