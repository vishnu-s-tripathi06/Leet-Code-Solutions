import java.util.ArrayList;
import java.util.List;

public class Problem_39 {
    public static void main(String[] args) {
        int[] candidates={2,3,4,5,6};
        int target=7;
        combinationSum(candidates, target);
    }


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        
            int index=0;
            List<List<Integer>> answer=new ArrayList<>();
            List<Integer> currentList=new ArrayList<>();
            helper(candidates,target,index,currentList,answer);
            return answer;
    }


    static void helper(int[] candidates, int target, int index, List<Integer> currentList, List<List<Integer>> answer){

        if(target==0){
            answer.add(new ArrayList<>(currentList));
            return;
            }

        if(target<0){
            return;       
        }
        
        if(index==candidates.length) return;

        currentList.add(candidates[index]);

        helper(candidates, target-candidates[index], index, currentList, answer);

        currentList.remove(currentList.size()-1);

        helper(candidates, target, index+1, currentList, answer);

    }
}



 
