class Solution {
    public int sumBase(int n, int k) {
        // code here
        int ans = 0;

        while (n > 0) {
            ans += n % k;
            n /= k;
        }

        return ans;
    }
}