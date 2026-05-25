void main(){
    int num=64;
    if(isPerfectSquare(num)) System.out.println(num+" is a perfect square.");
    else System.out.println(num+" is not a perfect square.");
}


public static boolean isPerfectSquare(int num) {
    long left=1;
    long right=num;
    while(left<=right){
         long mid=left+(right-left)/2;
        if(mid*mid==num) return true;
        else if(mid*mid>num) right=mid-1;
        else left=mid+1;
    }
        return false;
    }