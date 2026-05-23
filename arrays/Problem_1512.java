public class Problem_1512 {
    public static int main(int[] nums) {
        int number_of_good_pairs=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    number_of_good_pairs+=1;
                }
            }
        }
        return number_of_good_pairs;
    }
}
