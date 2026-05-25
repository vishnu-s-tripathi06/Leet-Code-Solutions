public class Problem_744 {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target='a';
    }
public char nextGreatestLetter(char[] letters, char target) {
    int left = 0;
    int right = letters.length - 1;
    char answer = letters[0]; // default to first letter

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (letters[mid] > target) {
            answer = letters[mid];   // candidate
            right = mid - 1;         // search left side for smaller candidate
        } else {
            left = mid + 1;          // search right side
        }
    }

    return answer;
}
}



