public class Problem_844 {
    public static void main(String[] args) {
        
    }
   public static boolean backspaceCompare(String s, String t) {
    return helper(s, t, s.length() - 1, t.length() - 1, 0, 0);
}

static boolean helper(String s, String t, int i, int j, int sSkip, int tSkip) {
    // handle backspaces in s
    if (i >= 0 && s.charAt(i) == '#') {
        return helper(s, t, i - 1, j, sSkip + 1, tSkip);
    } 
    else if (sSkip > 0 && i >= 0) {
        return helper(s, t, i - 1, j, sSkip - 1, tSkip);
    }

    // handle backspaces in t
    if (j >= 0 && t.charAt(j) == '#') {
        return helper(s, t, i, j - 1, sSkip, tSkip + 1);
    } 
    else if (tSkip > 0 && j >= 0) {
        return helper(s, t, i, j - 1, sSkip, tSkip - 1);
    }

    // base cases
    if (i < 0 && j < 0) return true;   // both finished
    if (i < 0 || j < 0) return false;  // one finished early

    // compare current characters
    if (s.charAt(i) != t.charAt(j)) return false;

    // recurse inward
    return helper(s, t, i - 1, j - 1, sSkip, tSkip);
}
}
