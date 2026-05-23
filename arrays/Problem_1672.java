public class Problem_1672 {
    public static int main(int[][] accounts){
        int maxWealth =0;
        
        for (int i=0;i<accounts.length;i++){
            int current_count=0;
            for (int j=0;j<accounts[i].length;j++){
                current_count+=accounts[i][j];
                
            }
            if (current_count>maxWealth){
                maxWealth=current_count;
               
            }

        }
     return maxWealth;
    }
}
