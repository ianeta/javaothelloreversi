package org.nothize.game.othello;

import java.util.Arrays;
import java.util.List;

public class Board {
	Piece pieces[][];
	private int width;
	private int height;

   	public Board() {
		this(8, 8);
	}

	public Board(int w, int h) {
		this.height = h;
		this.width = w;
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
	
	public Piece getPiece(Position pos) {
		return getPiece(pos.getX(), pos.getY());
	}

	public Piece getPiece(int x, int y) {
		if ( x >= 0 && x < width && y >= 0 && y < height ) {
			return pieces[y][x];
		}
		return Piece.UNDEFINED;
	}

	public boolean isValidMove(Piece p, Position pos) {
		Piece opp = p.getOpposite();
		
		// Only empty slot can be placed.
		if ( getPiece(pos) == Piece.EMPTY ) {
			
			/**
			 *  Check to see if any neighbor in the 8 directions is occupied but the opponent.
			 *  
			 */
			
			for ( Neighbor n : Neighbor.values() ) {
				Position nPos = pos.neighbor(n);
				if ( opp == getPiece(nPos) ) {
					Position end = findPiece(p, nPos, n);
					
					// If an end is found to be same as p, a valid move is found.
					if ( p == getPiece(end) ) {
						return true;
					}
				}
			}
		}
		
		return false;
	}

	/**
	 * A reduced neighbor list will be returned. This is done by the fact that
	 * any candidate position that is close to the border is impossible to
	 * occupy the border.
	 * 
	 * Thus we can safely exclude certain column or row when certain
	 * conditions are met.
	 *  
	 * When			Exclude
	 *  x <= 1		c1
	 *  x >= w-1	c3
	 *  
	 *  y <= 1		r1
	 *  y >= h-1	r3
	 * 
	 * @param pos
	 * @return
	 * @deprecated The cost of running this method may outweigh the benefit.
	 */
	private List<Neighbor> getReducedNeighbors(Position pos) {
		List<Neighbor> ns = Arrays.asList(Neighbor.values());
		int w = pieces[0].length;
		int h = pieces.length;
		int x = pos.getX();
		int y = pos.getY();
		
		if ( x <= 1 ) {
			ns.removeAll(Neighbor.c1);
		} else if ( x >= w-1 ) {
			ns.removeAll(Neighbor.c3);
		}
		if ( y <= 1 ) {
			ns.removeAll(Neighbor.r1);
		} else if ( y >= h-1 ) {
			ns.removeAll(Neighbor.r3);
		}
		return ns;
	}

	/**
	 * Find the target piece in the direction of neighbor n. An empty would
	 * terminate the search.
	 *
	 *
	 * @param p The target piece.
	 * @param pos The position to begin search. This should be a piece equals
	 * to the opposite of p.
	 * @param n The direction to search.
	 * @return null if the target piece is not found.
	 */
	private Position findPiece(Piece p, Position pos, Neighbor n) {
		Piece end;
		do {
			pos = pos.neighbor(n);
		} while ( p.getOpposite() == (end = getPiece(pos)) );
		if ( p == end ) {
			return pos;
		}
		return Position.UNDEFINED;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
