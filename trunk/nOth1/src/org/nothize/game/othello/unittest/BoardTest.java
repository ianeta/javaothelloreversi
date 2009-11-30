package org.nothize.game.othello.unittest;

import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.nothize.game.othello.Board;
import org.nothize.game.othello.Neighbor;
import org.nothize.game.othello.Piece;
import org.nothize.game.othello.Position;

public class BoardTest {

	@Test
	public void testIsValidMove() {
		Board b = new Board();
		
/**
  1 2 3 4 5 6 7 8
1 . . . . . . . .
2 . . . . . . . .
3 . . . V . . . .
4 . . V O X . . .
5 . . . X O V . .
6 . . . . V . . .
7 . . . . . . . .
8 . . . . . . . .
 * 		
 */
		Position p1 = new Position(3,3);
		Position p2 = new Position(4,4);
		List<Position> validMove = Arrays.asList(new Position[] {
			p1.neighbor(Neighbor.U), p1.neighbor(Neighbor.L),
			p2.neighbor(Neighbor.R), p2.neighbor(Neighbor.B)
		});
		
		for (int x = 0; x < b.getWidth(); x++) {
			for (int y = 0; y < b.getHeight(); y++) {
				Position p = new Position(x, y);
				boolean rez = b.isValidMove(Piece.BLACK, p);
				Assert.assertEquals(p.toString(), validMove.contains(p), rez);
			}
		}
	}

}
