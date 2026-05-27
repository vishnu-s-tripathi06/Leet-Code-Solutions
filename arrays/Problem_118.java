import java.util.ArrayList;
import java.util.List;

public class Problem_118 {
    void main(){
        int n=5;
        System.out.println(generate(n));

    }
      public static List<List<Integer>> generate(int n) {
        List<List<Integer>> answer=new ArrayList<>();
        for(int i=0;i<n;i++){

            answer.add(new ArrayList<>());

            for(int j=0;j<=i;j++){

                if(j==0 || j==i) answer.get(i).add(1);
                else answer.get(i).add(answer.get(i-1).get(j-1) + answer.get(i-1).get(j));
            }
        }

        return answer;
    }
}
