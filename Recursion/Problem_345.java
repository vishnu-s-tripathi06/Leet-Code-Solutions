public class Problem_345 {
    public static void main(String[] args) {
        String s = "hello";

    }
     public static String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        return helper(s, left , right);

    }
    public static String helper(String s, int left , int right){
        if(left>=right) return s;
        String letters="aeiouAEIOU";
      
            if(letters.indexOf(s.charAt(right)) == -1) return helper(s, left, --right);
            if(letters.indexOf(s.charAt(left)) == -1) return helper(s, ++left, right);
    
                char[] chars = s.toCharArray();
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                s = new String(chars);
                
            
        
        return helper(s, ++left, --right);
    }
}
