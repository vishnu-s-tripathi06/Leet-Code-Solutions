import java.util.*;
public class FirstUpperCase {
    public static void main(String[] args) {
        String sentence="lasjflasjdJlajsdJjal";
        System.out.println(upper(sentence));
    }
    static char upper(String word){
        
        if(word.isEmpty()) return '\0';
        if(Character.isUpperCase(word.charAt(0))){
           
            return word.charAt(0);
        }
        return upper(word.substring(1));
       
    }
    
}
       
           
