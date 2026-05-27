package Patterns;

public class patterns {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n;i++){
            for(int col=0;col<=(n+1)-i;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
