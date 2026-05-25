import java.util.Scanner;

public class Square_root_GFG {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number to find squart: ");
        int n=input.nextInt();
        int answer=squareRoot(n);
        System.out.println("Answer is : "+answer);
        input.close();
        
    }
    public static int squareRoot(int x){
        int root = 1;
        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid == x / mid) {   
                return mid;
            } else if (mid > x / mid) { 
                end = mid - 1;
            } else {                     
                root = mid;
                start = mid + 1;
            }
        }

        return root;
    }
}
