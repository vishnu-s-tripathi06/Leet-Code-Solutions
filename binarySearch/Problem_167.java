import java.util.Arrays;

public class Problem_167 {
    public static void main(String[] args) {
        int[] numbers={2,7,11,15};
        int target=9;
        int[] answer=twoSum(numbers, target);
        IO.println("The elements are at position: "+Arrays.toString(answer));
    }
    public static int[] twoSum(int[] numbers,int target){
        int n=numbers.length-1;
        int[] answer={0,0};
        int left=0;
        int right=n;
        while (left<right) {   
            if(numbers[left] + numbers[right] == target){
                answer[0] = left+1;
                answer[1] = right+1;
                return answer;
            }
            else if(numbers[left] + numbers[right] > target){
                right--;
            }
            else{
                left++;
            }
               

            
        }
        return answer;
    }


}
