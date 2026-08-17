public class Problem_509 {
    public static void main(String[] args) {
         int n=5;
         int x=5;
         double z=myPow(x, n);
         System.out.println(z);

    }
    public static double myPow(double x, int n) {
        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        if (N == 0) return 1;

        double half = myPow(x, (int)(N / 2));

        if (N % 2 == 0)
            return half * half;
        else
            return half * half * x;
        }
    }
