class Solution {
    public int numSpecial(int[][] mat) {
        int ans = 0;
        int rowLen = mat.length;
        int colLen = mat[0].length;
        int[] rowcheck = new int[rowLen];
        int[] colcheck = new int[colLen];

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (mat[i][j] == 1) {
                    rowcheck[i]++;
                    colcheck[j]++;
                }
            }
        }

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (mat[i][j] == 1) {
                    if (rowcheck[i] == 1 && colcheck[j] == 1) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}