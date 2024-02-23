class Solution {
    public int arraySign(int[] nums) {
        // code here
        int sign = 1;

        for (final int num : nums) {
            if (num == 0)
                return 0;
            if (num < 0)
                sign = -sign;
        }

        return sign;
    }
}