import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem_349 {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] answer=intersection(nums1,nums2);
        System.out.println(Arrays.toString(answer));

    }
      public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> lookup=new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for(int i =0;i<nums1.length;i++){
            lookup.add(nums1[i]);

        }
        for(int i=0;i<nums2.length;i++){
            if(lookup.contains(nums2[i])) intersection.add(nums2[i]);
        }

        int[] result = new int[intersection.size()];
        int idx = 0;
        for (int num : intersection) {
            result[idx++] = num;
        }
        return result;
     
    }
}
