public class Problem_1910 {
    public static void main(String[] args) {
        String s="abcabclasdjfljlsjflksjdlkfjslskdjflksabc";
        String part="abc";
        System.out.println(removeOccurrences(s, part));
    }
    public static String removeOccurrences(String s, String part) {
        int index=s.indexOf(part);
        if(index!=-1){
            s=s.substring(0,index) + s.substring(index+part.length());

            return removeOccurrences(s, part);
        }
        return s;
    }
    
}
