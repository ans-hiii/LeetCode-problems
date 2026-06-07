class Solution {
    public int diagonalSum(int[][] mat) {
        int size = mat.length;
        int total = 0;

        for (int i = 0; i < size; i++) {
            total += mat[i][i];
            total += mat[i][size - 1 - i];
        }

        if (size % 2 == 1) {
            total -= mat[size / 2][size / 2];
        }

        return total;
    }
}
