public class Problem_326 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(isPowerOfThree(n));
    }
    public static boolean isPowerOfThree(int n){
        int remainder=n%3;
        if(n<=0) return false;
        if(n==1) return true;
        if(remainder!=0) return false;
        return isPowerOfThree(n/3);



    }
}
