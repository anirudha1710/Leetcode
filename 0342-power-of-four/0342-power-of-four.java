class Solution {
    public boolean isPowerOfFour(int n) {
        // Code here 
        return n > 0 && (n & (n - 1)) ==0  && (n & 0x55555555) == n;
    }
}