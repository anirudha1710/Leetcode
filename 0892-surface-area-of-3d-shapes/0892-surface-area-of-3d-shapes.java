class Solution {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int totalSurfaceArea = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                
                if (grid[i][j] > 0) {
                    
                    totalSurfaceArea += 2 + grid[i][j] * 4;
                    
                    if (i > 0) {
                        totalSurfaceArea -= Math.min(grid[i][j], grid[i - 1][j]) * 2;
                    }
                    if (j > 0) {
                        totalSurfaceArea -= Math.min(grid[i][j], grid[i][j - 1]) * 2;
                    }
                }
            }
        }

        return totalSurfaceArea;
    }
}