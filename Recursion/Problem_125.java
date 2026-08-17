public class Problem_125 {
    public static void main(String[] args) {
        
    }
    public static boolean isPalindrome(String s) {
        String p=new String();

        return helper(p,s);
    }
    static boolean helper(String p, String s){
        if(s.isEmpty()){
            String reversed = "";
            for (int i = p.length() - 1; i >= 0; i--) {
                reversed += p.charAt(i);
            }

            if(p.equals(reversed)) return true;
            return false;
            

        }
        char x=s.charAt(0);
        if(Character.isUpperCase(x)) x=Character.toLowerCase(x);
        if(Character.isWhitespace(x) || !Character.isLetterOrDigit(x)){
            return helper(p, s.substring(1));
        }
        return helper(p+x, s.substring(1));
    }
        
}


/*
 int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
            
            return false;
            }
            left++;
            right--;


        }
        return true;

        
    }
*/
