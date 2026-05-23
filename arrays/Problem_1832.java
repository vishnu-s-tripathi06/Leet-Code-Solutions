
public class Problem_1832 {
    public static Boolean main(String sentence) {
        boolean[] seen=new boolean[26];

        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            int index=ch-'a';
            seen[index]=true;
        }
        for(int j=0;j<26;j++){
            if (!seen[j]){
                return false;
            }
        }

        return true;

    }
}
/*
  // Lowercase letters
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if(sentence.indexOf(i)==-1){
            return false}
        }
        return true;
 */