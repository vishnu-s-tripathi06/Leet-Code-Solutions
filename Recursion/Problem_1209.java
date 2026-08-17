public class Problem_1209 {
    public static void main(String[] args) {
        String s="deeedbbcccbdaa";
        int k = 3;
        System.out.println(removeDuplicates(s, k));;
    }
    static boolean checkGroup(String s , int i, int count, int k){
        if(count==k-1) return true;
    
        if((i+1<s.length()) && s.charAt(i) == s.charAt(i+1)){
            count++;
            return checkGroup(s, i+1, count, k);
        }
        return false;
    }
    static String removeDuplicates(String s, int k) {
        int left = 0;
        return helper(s,k,left);
  
    }
    static String helper(String s, int k, int left){
        if(left > s.length()-k) return s;
       
        if(checkGroup(s, left, 0, k)){
                s=s.substring(0,left)+s.substring(left+k);
                return helper(s, k, 0); 
            }
             return helper(s, k, left+1);
        }
       
    }

