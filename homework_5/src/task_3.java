//На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
// И вывести Доску. Пример вывода доски 8x8
public class task_3 {
    public static void main(String[] args) {
        int[][] chessBoard = new int[8][8];
        placeQueens(0, chessBoard);
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(chessBoard[i][j] + "  ");
            }
            System.out.println();
        }

    }

    public static boolean isSafe(int line, int column, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[line][i] == 1 || matrix[i][column] == 1) {
                return false;
            }
        }
        for (int i = line, j = column; i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j] == 1) {
                return false;
            }
        }
        for (int i = line, j = column;  i < matrix.length && j >=0; i++, j--) {
            if (matrix[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean placeQueens(int column, int[][] matrix) {
        if (column == matrix.length) {
            return true;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (isSafe(i, column, matrix)) {
                matrix[i][column] = 1;
                if (placeQueens(column + 1, matrix)) {
                    return true;
                }
                matrix[i][column] = 0;
            }
        }
        return false;
    }
}

