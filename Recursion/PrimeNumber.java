public class PrimeNumber {
    public static void main(String[] args) {
        int x=7;
        System.out.println(isPrime(x));
    }
    static boolean isPrime(int x){
        if(x<=2){
           return (x==2)?true:false; 
        }
        if(x%2==0) return false;
      
       return helper(x,3);
    }
    static boolean helper(int x,int i){
        
        if(x%i == 0) return false;
        if(i*i > x) return true;
        return helper(x, i+2);
    }
}

