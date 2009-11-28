package org.nothize.game.othello;


public class Player {
	PIECE piece;
	int score = 0;

	public Player(PIECE piece) {
		this.piece = piece;
	}

	public PIECE getPiece() {
		return piece;
	}

	public void setPiece(PIECE piece) {
		this.piece = piece;
	}
}
