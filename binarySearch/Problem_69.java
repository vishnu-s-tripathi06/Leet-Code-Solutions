public class Problem_69 {
    public static void main(String[] args) {
        int x=45;
        int answer=mySqrt(x);
        System.out.println(answer);
    }
    public static int mySqrt(int x) {
        if (x == 0) return 0;

        int root = 0;
        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid) {
                root = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return root;
    }
}
