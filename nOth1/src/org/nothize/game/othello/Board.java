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
	
	public boolean isValidMove(Position p) {
		int x = p.getX();
		int y = p.getY();
		
		// Only empty slot can be placed.
		if ( pieces[y][x] == Piece.EMPTY ) {
			
			// Check to see if any neighbor in the 8 directions is occupied by same player.
			
			
		}
		
		return false;
	}
}
