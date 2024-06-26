class Solution {
    public int tribonacci(int n) {
      if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2] + f[i - 3];
        }

        return f[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5; // You can change the value of n as needed
        System.out.println(solution.tribonacci(n));  
    }
}