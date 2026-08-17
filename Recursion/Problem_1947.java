public class Problem_1947 {
    public static void main(String[] args) {
        String s="aabbccddkklahdjsklhfjksdhfahfdhlaksdhkjsdhafkhfjksfhsdkfhah";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s) {
       int i=0;
       return helper(s,i);
    }
    static String helper(String s, int i){
        if(i>s.length()-2) return s;
        if(s.charAt(i) == s.charAt(i+1)){
            s=s.substring(0,i) + s.substring(i+2,s.length());
            return helper(s, 0);
        }
        return helper(s, ++i);
    }
}
