import java.util.Arrays;


public class Problem_1818 {
    static int[] diff={};
    public static void main(String[] args) {
        int[] nums1={};
        int[] nums2={};
        
        
    }
     public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
            long total=0;
            long bestGain=0;
            int[] sorted=nums1.clone();
            Arrays.sort(sorted);
        
            for(int i=0;i<nums1.length;i++){
                total+=Math.abs(nums1[i]-nums2[i]);
                
            }
            for(int k=0;k<nums1.length;k++){
                int idx = searchCandidate(sorted, nums2[k]);

                int oldDiff = Math.abs(nums1[k] - nums2[k]);
                int newDiff = oldDiff;

                if (idx < sorted.length) {
                    newDiff = Math.min(newDiff,
                            Math.abs(sorted[idx] - nums2[k]));
                }

                if (idx > 0) {
                    newDiff = Math.min(newDiff,
                            Math.abs(sorted[idx - 1] - nums2[k]));
                }

                bestGain = Math.max(bestGain, oldDiff - newDiff);
            }
            

            //Binary search 
        
                long MOD = 1_000_000_007;
                    return (int)((total - bestGain) % MOD);
        }
        static int searchCandidate(int[] sorted,int target){
                int left = 0;
                int right = sorted.length - 1;
                int ans = sorted.length;

                while (left <= right) {
                    int mid = left + (right - left) / 2;

                    if (sorted[mid] < target) {
                        left = mid + 1;
                    } else {
                        ans = mid;
                        right = mid - 1;
                    }
                }

                return ans;
                }
    }
