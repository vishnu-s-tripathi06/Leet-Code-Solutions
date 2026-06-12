public class Problem_62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 3));
    }
    public static int uniquePaths(int m, int n) {
        if(m==1 || n==1) return 1;
        int total = uniquePaths(m-1, n) + uniquePaths(m, n-1);
        return total;
    }
}

// class Solution {
//     public int uniquePaths(int m, int n) {
//         long res = 1;
//         for(int i=1; i<=m-1; i++) {
//             res = res * (n-1+i) / i;
//         }
//         return (int)res;

//     }
// }