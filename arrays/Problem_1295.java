public class Problem_1295 {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        int n=findNumbers(nums);
        System.out.println(n);
    }


     public static int findNumbers(int[] nums) {
        int count=0;
        for(int i: nums){
        int digitCount=0;
           while(i>0){
            i=i/10;
            digitCount++;
           }
           if(digitCount%2==0){
            count++;
           }
           
        }
        return count;
    }
}
