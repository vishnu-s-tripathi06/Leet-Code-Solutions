public class Problem_1732 {
    public static int main(int[] gains) {
        int highest_altitude=0;
        int gain_total=0;
        for(int i:gains){
            gain_total+=i;
            int current_altitude=gain_total;
            if(current_altitude>highest_altitude)
                    highest_altitude=current_altitude;
        }
        return highest_altitude;
        }
    }
           
               
        




