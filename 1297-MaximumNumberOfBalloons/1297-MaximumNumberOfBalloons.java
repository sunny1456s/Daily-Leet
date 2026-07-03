// Last updated: 7/3/2026, 11:28:43 PM
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[26];

        for (char c : text.toCharArray()) {
            count[c - 'a']++;
        }

        return Math.min(
            Math.min(count['b' - 'a'], count['a' - 'a']),
            Math.min(count['l' - 'a'] / 2,
            Math.min(count['o' - 'a'] / 2, count['n' - 'a']))
        );
    }
}