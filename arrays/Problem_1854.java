public class Problem_1854 {
    public static void main(String[] args) {
         int [][] logs = {{1950,1961},{1960,1971},{1970,1981}};
         int year=maximumPopulation(logs);
         System.out.println(year);
    }
    public static int maximumPopulation(int[][] logs) {
      
      
       int max_alive=0;
       int best_year=1950;
       for(int year=1950; year<2050;year++){
            int alive=0;
            for(int r=0;r<logs.length;r++){
              
                int birth = logs[r][0];
                int death = logs[r][1];
                if(birth <= year && year < death){
                    alive++;
                    
                }
                if(alive>max_alive){
                    max_alive=alive;
                    best_year=year;
                    
                }
            
    
        
       }
        }
       return best_year;

    }
}

