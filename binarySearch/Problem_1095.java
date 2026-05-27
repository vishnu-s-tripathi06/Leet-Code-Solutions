public class Problem_1095 {
     public static void main(String[] args) {
        int[] mountainArr={1,3,5,8,6,4,2};
        int target=4;
        int answer=findPeak(mountainArr,target);
        System.out.println(answer);
    }
    public static int findPeak(int[] mountainArr,int target){
        int start=0;
        int end=mountainArr.length-1;

        while(start < end){

            int mid=start + (end-start) / 2;


            if(mountainArr[mid] < mountainArr[mid + 1]){
                start = mid + 1;

            }
            else{
                end = mid;
            }
        }

        //First loop through smaller array.
        int peak=start;
        start=0;
        end=peak;
            while(start<=end){
                int mid=start + (end-start) / 2;
                if(target==mountainArr[mid]) return mid;
                else if(mountainArr[mid]>target){
                    end=mid-1;
                }
                else start=mid+1;
            }
        //second loop through higher array as we wanted a smaller Index first.
        start=peak+1;
        end=mountainArr.length-1;
            while(start<=end){
                int mid=start + (end-start) / 2;
                if(target==mountainArr[mid]) return mid;
                else if(mountainArr[mid]>target){
                    start=mid+1;
                }
                else end=mid-1;
            }
            return -1;
        }
    }
       

        
       
           

    
      

    
            
    

