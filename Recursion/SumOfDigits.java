public class SumOfDigits {
    public static void main(String[] args) {
        int digit=5724;
        System.out.println(sum(digit));

    }
    static int sum(int digit){
        if(digit==0) return 0;
        int rem=digit%10;
        return rem+ sum(digit/10);
    }
}
