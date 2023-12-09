class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] res = new int[m * n];
        int row = 0, col = 0;
        int[] move = new int[]{-1, 1};

        for (int i = 0; i < m*n; i++) {
            res[i] = mat[row][col];
            row += move[0]; //-1
            col += move[1]; //1

            if (row == -1 || col == n) {
                row++;
                move[0] *= -1;
                move[1] *= -1;
                if (col == n) {
                    row += move[0];
                    col += move[1];
                }
            } else if (col == -1 || row == m) {
                col++;
                move[0] *= -1;
                move[1] *= -1;
                if (row == m) {
                    row += move[0];
                    col += move[1];
                }
            }
        }
        return res;
    }
}