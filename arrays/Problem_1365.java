public class Problem_1365 {
    public static int[] main(int[] nums,int[] index) {
        int[] target=new int[nums.length];
        int size=0;


        for(int i=0;i<nums.length;i++){
            int pos=index[i];

            for(int j=size-1;j>=pos;j--){
                target[j+1]=target[j];

            }
            target[pos]=nums[i];
            size++;
        }



        return target;
    }
}
