public class Problem_680 {
    public static void main(String[] args) {
        String s="dupty dumpty sat on a wall";

    }
 
    public static boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        boolean del=false;
        return helper(left,right,del,s);
    }
    static boolean helper(int left,int right,boolean del,String s){
         if(left>=right) return true;
         if(s.charAt(left) == s.charAt(right)) return helper(left+1, right-1, del, s);
        
         if(s.charAt(left) != s.charAt(right) && del == false){
          
            return helper(left+1, right, true, s) ||  helper(left, right - 1, true, s);
           
        }
        return false;
    }
}
            
         


        

