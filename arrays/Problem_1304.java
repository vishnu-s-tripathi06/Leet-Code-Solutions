import java.util.Arrays;

public class Problem_1304 {
    public static void main(String[] args) {
        int n=5;
        int[] answer=sumZero(n);
        System.out.println(Arrays.toString(answer));
    }
     public static int[] sumZero(int n) {
        int[] answer=new int[n];
        int num=1;
        if(n%2!=0){
            answer[n-1]=0;
        }
        for(int i=0;i<n-1;i+=2){
            answer[i]=num;
            answer[i+1]=-num;
            num++;

        }
        
        return answer;
    }
}
