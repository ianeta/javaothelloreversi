package org.nothize.game.othello;

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
	};

	public abstract char getFace();
};

class test {
	public static void main(String[] args) {
		System.out.println(Piece.BLACK);
	}
}