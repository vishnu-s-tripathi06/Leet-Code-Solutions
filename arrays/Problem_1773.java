import java.util.List;

public class Problem_1773 {
    public static int main(List<List<String>> items, String ruleKey, String ruleValue) {
        int index;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2; // "name"
        }

        
        int count = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
        
    }
}
