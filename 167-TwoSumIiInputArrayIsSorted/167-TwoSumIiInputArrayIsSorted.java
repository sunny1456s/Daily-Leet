// Last updated: 7/3/2026, 11:28:59 PM
import java.util.Arrays;

class Solution {

    static class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public int[] twoSum(int[] nums, int target) {

        Pair[] arr = new Pair[nums.length];

        // FIX 1: start from 0
        for (int i = 0; i < nums.length; i++) {
            arr[i] = new Pair(nums[i], i);
        }

        Arrays.sort(arr, (a, b) -> a.value - b.value);

        // FIX 2: start left from 0
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left].value + arr[right].value;

            if (sum == target) {
                return new int[]{arr[left].index+1, arr[right].index+1};
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {3,2,4};
        int target = 6;

        int[] result = obj.twoSum(nums, target);

    
        System.out.println(result[0] + " " + result[1]);
    }
}