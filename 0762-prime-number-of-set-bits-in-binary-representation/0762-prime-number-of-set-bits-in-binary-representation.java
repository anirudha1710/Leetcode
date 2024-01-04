class Solution {
    public int countPrimeSetBits(int left, int right) {
        final int magic = 665772;
        int ans = 0;

        for (int n = left; n <= right; ++n)
            if ((magic & 1 << Integer.bitCount(n)) > 0)
                ++ans;

        return ans;
    }
}
