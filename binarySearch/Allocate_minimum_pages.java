public class Allocate_minimum_pages {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8,9,10};
        int k=2;
        System.out.println(Sum(arr));

    }

    public static int Sum(int[] nums){
        int sum=0;
        for(int i: nums){
            sum+=i;
        }
        return sum;
    }
}
   