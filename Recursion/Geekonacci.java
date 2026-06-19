public class Geekonacci {
    public static void main(String[] args) {
        
    }
    public static int Geek(int a,int b,int c, int n){
        if(n==1) return a;
        if(n==2) return b;
        if(n==3) return c;
        return Geek(a, b, c, n-1)+Geek(a, b, c, n-2)+Geek(a, b, c, n-3);
    }
}
