public class tillNnumbers {
    public static void main(String[] args) {
        printNtill(7);
    }
    public static void printNtill(int n){
        int start=1;
        helper(start,n);
    }
    public static void helper(int start,int n){
        if(start>n) return;
        IO.println(start);
        helper(start+1, n);
    }
}
