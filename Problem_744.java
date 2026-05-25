public class Problem_744 {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target='a';
        char answer=nextGreatestLetter(letters, target);
        System.out.println("Answer is: "+answer);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        char answer=letters[0];
        int left=0;
        int right=letters.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(letters[mid]>target){
                answer=letters[mid];
                right=mid-1;
            }
            else  left=mid+1;
        }

        return answer;
    }
}
