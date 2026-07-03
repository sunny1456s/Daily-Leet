// Last updated: 7/3/2026, 11:29:04 PM
class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int currentNum) {
        if (node == null) return 0; // Base case: no node, no treasure

        currentNum = currentNum * 10 + node.val; // Build the path number like stacking LEGO

        if (node.left == null && node.right == null) {
            return currentNum; // Leaf found! Treasure collected
        }

        // Recurse left and right, sum all treasures
        return dfs(node.left, currentNum) + dfs(node.right, currentNum);
    }
}