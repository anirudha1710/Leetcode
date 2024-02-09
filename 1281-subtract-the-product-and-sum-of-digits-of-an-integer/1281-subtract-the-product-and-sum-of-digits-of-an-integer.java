class Solution {
    public int subtractProductAndSum(int n) {
        // code here
        int sum = 0;
        int product = 1;
        for (; n > 0; n /= 10) {
            product *= n % 10;
            sum += n % 10;
        }
        return product - sum;
    }
}