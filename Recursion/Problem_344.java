public class Problem_344 {
    public static void main(String[] args) {
        char[] s={"h","e","l","l","o"};
    }

    public void reverseString(char[] s) {
        int idx=0;
        int lstIdx=s.length-1;
        helper(s,idx,lstIdx);
    }
    public static void helper(char[] s,int idx,int lstIdx){
        if(idx>=lstIdx) return;
        swap(s,idx,lstIdx);
        helper(s,idx+1,lstIdx-1);
    }
    static void swap(char[]s,int first,int last){
    char temp=s[last];
        s[last]=s[first];
       s[first]=temp;
    }
}
