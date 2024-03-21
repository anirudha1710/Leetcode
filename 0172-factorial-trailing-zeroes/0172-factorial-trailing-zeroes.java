class Solution {
    public int trailingZeroes(int n) {
        // code here 
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}