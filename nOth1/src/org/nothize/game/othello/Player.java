package org.nothize.game.othello;


public class Player {
	Piece piece;
	int score = 0;

	public Player(Piece piece) {
		this.piece = piece;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}
}
