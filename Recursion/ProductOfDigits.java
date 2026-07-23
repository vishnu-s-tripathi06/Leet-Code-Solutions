public class ProductOfDigits {
    public static void main(String[] args) {
        int x=6;
        int y=7;
        System.out.println(product(x, y));
    }
    static int product(int x, int y){
        if(y==0 || x==0) return 0;
        return x+product(x, y-1);
    }
}
