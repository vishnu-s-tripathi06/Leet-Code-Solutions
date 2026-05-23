public class problem_441 {
    public static int mySqrt(long x){
        if (x == 0) return 0;

        long root = 0;
        long start = 1;
        long end = x;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid <= x / mid) {
                root = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return (int)root;
    }

    public static int arrangeCoins(int n) {
        long m=n;
        return (mySqrt(8*m+1)-1)/2;
    }
}
