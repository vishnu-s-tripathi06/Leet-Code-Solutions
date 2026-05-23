class Problem_1480{
    public static int[] main(int[] nums){
        int[] runningSum=new int[nums.length];
        
        int runningTotal=0;

        for (int i=0;i<nums.length;i++){
            
            runningTotal+=nums[i];
           
            runningSum[i]=runningTotal;
        }
        return runningSum;
    }
}
         
            
            
