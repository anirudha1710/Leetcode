class Solution {
    public int removeDuplicates(int[] n) {
        int j = 0;
        for (int i = 0; i<n.length-1;i++){
            if(n[i]!=n[i+1]){
                n[j++] = n[i];
            }
        }
        n[j++] = n[n.length-1];
        return j;
    }
}