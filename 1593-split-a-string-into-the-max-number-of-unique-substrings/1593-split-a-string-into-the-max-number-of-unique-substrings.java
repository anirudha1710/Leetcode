class Solution {
    public int maxUniqueSplit(String s) {
        int[] ans = new int[]{0};
        dfs(s, 0, new HashSet<>(), ans);
        return ans[0];
    }

    private void dfs(String s, int start, Set<String> seen, int[] ans) {
        if (start == s.length()) {
            ans[0] = Math.max(ans[0], seen.size());
            return;
        }

        for (int i = 1; start + i <= s.length(); ++i) {
            String cand = s.substring(start, start + i);
            if (seen.contains(cand))
                continue;
            seen.add(cand);
            dfs(s, start + i, seen, ans);
            seen.remove(cand);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "abac";
        System.out.println(solution.maxUniqueSplit(input));  // Output: 2
    }
}