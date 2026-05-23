import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem_989 {
    public static void main(String[] args) {
        int[] nums={1,2,0,0};
        int k=34;
        List<Integer> answer=addToArrayForm(nums,k);
        System.out.println(answer);

    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> n=new ArrayList<>();
        int hand=0;
        
        for(int i=num.length-1;i>=0;i--){
            int digit=0;
           
                int current=0;
                int l=k%10;
                k=k/10;

                current=num[i]+l+hand;
                hand=current/10;
                digit=current%10;
        
            n.add(digit);
         

        }
        while (k > 0) {
        int current = k % 10 + hand;
        hand = current / 10;
        int digit = current % 10;
        n.add(digit);
        k = k / 10;
    }


        if (hand > 0) {
            n.add(hand);
        }
        Collections.reverse(n);
        return n;
    }
}
