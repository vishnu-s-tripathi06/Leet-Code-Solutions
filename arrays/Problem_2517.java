import java.util.Arrays;

public class Problem_2517 {
    public static void main(String[] args) {
        int[] price={13,5,1,8,21,2};
        int k=3;
        System.out.println(maximumTastiness(price, k));
    }
     public static int maximumTastiness(int[] price, int k) {
         Arrays.sort(price);
         int n=price.length;
         int answer=0;
         int left = 0;
         int right = price[n-1] - price[0];

         while(left <= right){
             int mid = left + (right - left) / 2;

             if(canPick(price, k, mid)){
                answer=mid;
                left=mid+1;
             }
             else right=mid-1;
            }
            return answer;
        }
    
            
            

public static boolean canPick(int[] price, int k, int mid){
    int count=1;
    int lastPicked=price[0];
    for(int i=1;i < price.length; i++){
        if(price[i] - lastPicked >= mid){
            count+=1;
            lastPicked = price[i];
        }

       if(count >= k) return true;

    }
    return false;
}

   
        
}
