import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_90 {
    public static void main(String[] args) {
        
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int idx=0;
        List<Integer> current=new ArrayList<>();
        List<List<Integer>> answer=new ArrayList<>();
        helper(nums,idx,current,answer);
        return answer;
    }
    public static void helper(int[] nums, int idx, List<Integer> current, List<List<Integer>> answer){
        if(idx==nums.length){
            answer.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[idx]);
        helper(nums, idx+1, current, answer);

        current.remove(current.size()-1);

        
        while (idx + 1 < nums.length && nums[idx] == nums[idx + 1]) {
            
            idx++;
        }
            
        helper(nums, idx+1, current, answer);

        

    }
}
