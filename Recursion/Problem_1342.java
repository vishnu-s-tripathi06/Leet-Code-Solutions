public class Problem_1342 {
    public static void main(String[] args) {
        int n=57;
        System.out.println(numberOfSteps(n));
    }
    public static int numberOfSteps(int num) {
        if(num==0) return 0;
        if(num%2!=0){
        
            return 1 + numberOfSteps(num-1);
        }   
        return 1 + numberOfSteps(num/2);
    }
}
    
       

        

    
    


