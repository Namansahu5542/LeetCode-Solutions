class Solution {
    public static boolean isSafeToPlace(char[][] board, int row, int col, int n) {
        int r = row;
        int c = col;
        while (c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            c--;
        }
        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c--;
        }
        r = row;
        c = col;
        while (r < board.length && c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r++;
            c--;
        }
        return true;

    }

    public static void solve(char[][] board, int n, int col, List<List<String>> ans) {

        if (col >= n) {
            List<String> li = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                li.add(new String(board[i]));
            }
            ans.add(li);
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafeToPlace(board, row, col, n)) {
                board[row][col] = 'Q';
                solve(board, n, col + 1, ans);
            }
            board[row][col] = '.';
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] chess = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(chess[i], '.');
        }

        List<List<String>> ans = new ArrayList<>();
        solve(chess, n, 0, ans);
        return ans;
    }
}