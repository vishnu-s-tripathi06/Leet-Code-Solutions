import java.util.ArrayList;
import java.util.List;

public class Problem_78 {
    public static void main(String[] args) {
        
    }
    public static List<List<Integer>> subsets(int[] nums) {
        int idx=0;
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        helper(nums, idx, current, answer);
        return answer;
    }
    
    public static void helper(int[] nums,int idx,List<Integer> current,List<List<Integer>> answer){
        if(idx==nums.length){
            answer.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[idx]);
        helper(nums, idx+1, current, answer);
        current.remove(current.size()-1);
        helper(nums, idx+1, current, answer);
    }
}
