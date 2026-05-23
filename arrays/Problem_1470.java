public class Problem_1470 {
    public static int[] main(int[] nums, int n) {
        
        int[] desiredList = new int[2*n];
      int index=0;
        for (int i=0;i<n;i++){
            desiredList[index]=nums[i];
            desiredList[index+1]=nums[i+n];
            index+=2;
            
            
        }

        return desiredList;
    }
  

}
//[1,2,3,4,5,6]
/*
1,4    index=0
2,5    index=2
3,6    index=4



*/