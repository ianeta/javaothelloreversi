package org.open.game.othello;

public enum Piece {
	EMPTY {
		@Override
		public char getFace() {
			return '.';
		}
	}, BLACK {
		@Override
		public char getFace() {
			return 'X';
		}
	}, WHITE {
		@Override
		public char getFace() {
			return 'O';
		}
	}, UNDEFINED {
		@Override
		public char getFace() {
			return 'U';
		}
	};

	public abstract char getFace();
	private Piece opp;
	
	public Piece getOpposite() {
		switch ( this ) {
			case BLACK:
				return WHITE;
			case WHITE:
				return BLACK;
			default:
				return UNDEFINED;
		}
	}
};

class test {
	public static void main(String[] args) {
		System.out.println(Piece.BLACK);
	}
}