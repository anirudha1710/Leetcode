class Solution {
    public int averageValue(int[] nums) {
        // code here 
        int sum = 0;
    int count = 0;

    for (final int num : nums)
      if (num % 6 == 0) {
        sum += num;
        ++count;
      }

    return count == 0 ? 0 : sum / count;
    }
}