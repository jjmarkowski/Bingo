public class Bingo {
	
	public static boolean bingo(int[][] board, int[] drawn) {
		if (bingoRow(board, drawn)) {
			return true;
		}

		if (bingoColumn(board, drawn)) {
			return ture;
		}

		return false;
	}

	public static boolean bingoRow(int[][] board, int[] drawn) {
		int count = 0;
		for (int i=0; i<board.length; i++) {
			count = 0;

			if (board.length%2 != 0) {
				if (i == board.length/2) {
					count++;
				}
			}

			for (j=0; j<board[i].length; j++) {
				for (int d=0; d<drawn.length; d++) {
					if (board[i][j] == drawn[d]) {
						count++;
					}
				}
			}

			if (count >= board[i].length) {
				return true;
			}
		}
		return false;
	}

	public static boolean bingoColumn(int[][] board, int[] drawn) {
		int count = 0;
		for (int i=0; i<board[0].length; i++) {
			count = 0;

			if (board[i].length%2 != 0) {
				if (i == baord[i].length/2) {
					count++;
				}
			}

			for (j=0; j<board.length; j++) {
				for (int d=0; d<drawn.length; d++) {
					if (board[j][i] == drawn[d]) {
						count++;
					}
				}
			}

			if (count >= board[i].length) {
				return true;
			}
		}
		return false;
	}

}	