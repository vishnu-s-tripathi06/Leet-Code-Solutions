public class Problem_2064{
    public static void main(String[] args) {
        int[] quantities={15,10,10};
 
        int n=7;
        int answer=minimizedMaximum(n, quantities);
        System.out.println(answer);

    }
public static int minimizedMaximum(int n, int[] quantities) {
        int answer=0;
        int left=1;
        int right=findLargest(quantities);
   
        while(left<=right){
            int mid=left+(right-left)/2;
          
             int storesNeeded=0;
            for(int q: quantities){
                storesNeeded += Math.ceilDiv(q,mid);
            }
           
            if(storesNeeded <= n) {

                answer=mid;
                right=mid-1;

            }
          
            else if(storesNeeded > n)         left=mid+1;
          

        }

        return answer;
    }


public static int findLargest(int[] arr){
       int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // 
            }
        }
        return max;
    }
public static int Sum(int[] arr){
    int sum=0;
     for(int i: arr){
             sum+=i;
            }
    return sum;

}

}