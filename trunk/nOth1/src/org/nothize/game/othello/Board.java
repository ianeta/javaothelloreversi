package org.nothize.game.othello;

public class Board {
	Piece pieces[][] = new Piece[8][8];
	
	public Board() {
		for (int i = 0; i < pieces.length; i++) {
			for (int j = 0; j < pieces[i].length; j++) {
				pieces[i][j] = Piece.EMPTY;
			}
		}
		
		starting();
	}

	private void starting() {
		pieces[3][3] = Piece.BLACK;
		pieces[4][4] = Piece.BLACK;
		pieces[3][4] = Piece.WHITE;
		pieces[4][3] = Piece.WHITE;
	}

	public Piece[][] getPieces() {
		return pieces;
	}
}
