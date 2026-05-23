import java.util.ArrayList;
import java.util.List;

public class Problem_1431 {
    public static List<Boolean> main(int[] candies, int extraCandies) {
         List<Boolean> result = new ArrayList<>();
        int greatest_number_of_candies=0;
        for (int i: candies){
            if (i>greatest_number_of_candies){
                greatest_number_of_candies=i;

            }
        }
        for (int i=0;i<candies.length;i++){
            if (candies[i]+extraCandies>=greatest_number_of_candies){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }


        return result;
    }
}
