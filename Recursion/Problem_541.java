public class Problem_541 {
    public static void main(String[] args) {
        String s = "hello";

    }
     public static String reverseStr(String s, int k) {
        int start=0;
        int min=s.length()-1;
        return helper(s,k, start,min);
    }
    static String helper(String s, int k, int start , int min){
        helper(s, k, start+k-1, s.length()-1);
        start =  start + 2*k;
        return  helper(s, k, start+k-1, s.length()-1);
    }
}
