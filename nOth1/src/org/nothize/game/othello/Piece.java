package org.nothize.game.othello;

public enum Piece {
	EMPTY(Piece.EMPTY) {
		@Override
		public char getFace() {
			return '.';
		}
	}, BLACK(Piece.WHITE) {
		@Override
		public char getFace() {
			return 'X';
		}
	}, WHITE(Piece.BLACK) {
		@Override
		public char getFace() {
			return 'O';
		}
	}, UNDEFINED(Piece.UNDEFINED) {
		@Override
		public char getFace() {
			return 'U';
		}
	};

	public abstract char getFace();
	private Piece opp;
	
	Piece(Piece p) {
		this.opp = p;
	}

	public Piece getOpposite() {
		return opp;
	}
};

class test {
	public static void main(String[] args) {
		System.out.println(Piece.BLACK);
	}
}