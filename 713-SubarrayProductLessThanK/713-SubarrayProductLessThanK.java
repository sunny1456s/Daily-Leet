// Last updated: 7/3/2026, 11:28:50 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int start = 0, product = 1,count = 0;
        if(k<=1) return 0;
        for(int end=0;end<nums.length;end++) {
            product*=nums[end];
            while(product>=k) {
                product/=nums[start++];
            }
            count+=end-start+1;
        }
        return count;
    }
}