package org.open.game.othello;


public abstract class Player {
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
	
	@Override
	public String toString() {
		return piece.toString();
	}

	public abstract Position getMove();
}
