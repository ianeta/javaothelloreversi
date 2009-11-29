package org.nothize.game.othello;

public class Board {
	Piece pieces[][];

   	public Board() {
		this(8, 8);
	}

	public Board(int w, int h) {
		pieces = new Piece[h][w];
		for (int i = 0; i < pieces.length; i++) {
			for (int j = 0; j < pieces[i].length; j++) {
				pieces[i][j] = Piece.EMPTY;
			}
		}
		
		starting();
	}
	
	private void starting() {
		int m = pieces.length / 2;
		pieces[m-1][m-1] = Piece.WHITE;
		pieces[m-1][m] = Piece.BLACK;
		pieces[m][m-1] = Piece.BLACK;
		pieces[m][m] = Piece.WHITE;
	}

	public Piece[][] getPieces() {
		return pieces;
	}
}
