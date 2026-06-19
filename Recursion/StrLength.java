public class StrLength {
    public static void main(String[] args) {
        String word ="ABCD";
        System.out.println(count(word));    
    }
    public static int count(String word){
          if(word.isEmpty()) return 0;
          return 1+count(word.substring(1));
    }
}
