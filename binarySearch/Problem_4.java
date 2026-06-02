import java.util.Arrays;

public class Problem_4 {
    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] nums2={2};
        // System.out.println(findMedianSortedArrays(nums1, nums2));
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
     public static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median=0;

        int[] merged=new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
     
        Arrays.sort(merged); // ensure sorted

        int n = merged.length;
        if (n % 2 != 0) {
            // Odd length → middle element
            return merged[n / 2];
        } else {
            // Even length → average of two middle elements
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        }
    }
}
