// Last updated: 7/3/2026, 11:28:51 PM
import java.util.Arrays;

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        for (int k = n - 1; k >= 2; k--) {
            int i = 0, j = k - 1;
            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += (j - i); // all pairs between i and j-1 are valid
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solver = new Solution();
        int[] nums1 = {2, 2, 3, 4};
        int[] nums2 = {4, 2, 3, 4};
        System.out.println(solver.triangleNumber(nums1)); // Output: 3
        System.out.println(solver.triangleNumber(nums2)); // Output: 4
    }
}
