public class Problem_231 {
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPowerOfTwo(n));

    }
    public static boolean isPowerOfTwo(int n) {
        if( n<=0) return false;
        if(n==1) return true;
        if(n%2 !=0 && n>1) return false;
        return isPowerOfTwo(n/2);
       
    }

}
