public class Problem_832 {
    public static int[][] main(int[][] image) {
     
        for(int row=0;row<image.length;row++){

            for(int column=0;column<image[row].length/2;column++){

                int temp = image[row][column];
                image[row][column] = image[row][image[row].length - 1 - column];
                image[row][image[row].length - 1 - column] = temp;

            }
            for(int i=0;i<image[row].length;i++){
                if(image[row][i]==0){
                        image[row][i]=1;
                    }
                    else{
                        image[row][i]=0;
                    }
            }



          
        }
            return image;
            
        }
    }
                
                

                

